package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class z implements Closeable {
    private final File a;
    private final long b;
    private final File c;
    private final RandomAccessFile d;
    private final FileChannel e;
    private final FileLock f;

    public z(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.a = file;
        this.c = file2;
        this.b = c(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                f(this.e);
                throw e;
            } catch (Error e2) {
                e = e2;
                f(this.e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                f(this.e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            f(this.d);
            throw e4;
        }
    }

    private static long b(File file) {
        long jLastModified = file.lastModified();
        if (jLastModified == -1) {
            return -2L;
        }
        return jLastModified;
    }

    private static long c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length();
            long j = (-22) + length;
            if (j < 0) {
                throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
            }
            long j2 = length - 65558;
            if (j2 < 0) {
                j2 = 0;
            }
            int iReverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == iReverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    long jReverseBytes = Integer.reverseBytes(randomAccessFile.readInt());
                    CRC32 crc32 = new CRC32();
                    randomAccessFile.seek(Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L);
                    long j3 = jReverseBytes & 4294967295L;
                    byte[] bArr = new byte[16384];
                    int i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j3));
                    while (i != -1) {
                        crc32.update(bArr, 0, i);
                        j3 -= i;
                        if (j3 == 0) {
                            break;
                        }
                        i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j3));
                    }
                    long value = crc32.getValue();
                    randomAccessFile.close();
                    if (value == -1) {
                        return -2L;
                    }
                    return value;
                }
                j--;
            } while (j >= j2);
            throw new ZipException("End Of Central Directory signature not found");
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    private static SharedPreferences d(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x027c, code lost:
    
        r12 = r12 + 1;
        r13 = r11.getEntry(defpackage.a.a(r12, "classes", ".dex"));
        r6 = r16;
        r2 = r17;
        r7 = r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z.e():java.util.List");
    }

    private static void f(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    private static void g(Context context, long j, long j2, List list) {
        SharedPreferences.Editor editorEdit = d(context).edit();
        editorEdit.putLong("timestamp", j);
        editorEdit.putLong("crc", j2);
        editorEdit.putInt("dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            y yVar = (y) it.next();
            editorEdit.putLong(a.b(i, "dex.crc."), yVar.a);
            editorEdit.putLong(a.b(i, "dex.time."), yVar.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    public final List a(Context context, boolean z) throws IOException {
        List arrayList;
        StringBuilder sb = new StringBuilder("MultiDexExtractor.load(");
        File file = this.a;
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(z);
        sb.append(", )");
        Log.i("MultiDex", sb.toString());
        if (!this.f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (z) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            long j = this.b;
            SharedPreferences sharedPreferencesD = d(context);
            long j2 = -1;
            if (sharedPreferencesD.getLong("timestamp", -1L) == b(file) && sharedPreferencesD.getLong("crc", -1L) == j) {
                try {
                    Log.i("MultiDex", "loading existing secondary dex files");
                    String strConcat = String.valueOf(file.getName()).concat(".classes");
                    SharedPreferences sharedPreferencesD2 = d(context);
                    int i = sharedPreferencesD2.getInt("dex.number", 1);
                    arrayList = new ArrayList(i - 1);
                    int i2 = 2;
                    while (i2 <= i) {
                        y yVar = new y(this.c, strConcat + i2 + ".zip");
                        if (!yVar.isFile()) {
                            throw new IOException("Missing extracted secondary dex file '" + yVar.getPath() + "'");
                        }
                        yVar.a = c(yVar);
                        long j3 = sharedPreferencesD2.getLong("dex.crc." + i2, j2);
                        long j4 = sharedPreferencesD2.getLong("dex.time." + i2, j2);
                        long jLastModified = yVar.lastModified();
                        if (j4 == jLastModified) {
                            int i3 = i;
                            SharedPreferences sharedPreferences = sharedPreferencesD2;
                            if (j3 == yVar.a) {
                                arrayList.add(yVar);
                                i2++;
                                sharedPreferencesD2 = sharedPreferences;
                                i = i3;
                                j2 = -1;
                            }
                        }
                        throw new IOException("Invalid extracted dex: " + yVar + " (key \"\"), expected modification time: " + j4 + ", modification time: " + jLastModified + ", expected crc: " + j3 + ", file crc: " + yVar.a);
                    }
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    List listE = e();
                    g(context, b(this.a), this.b, listE);
                    arrayList = listE;
                }
                Log.i("MultiDex", "load found " + arrayList.size() + " secondary dex files");
                return arrayList;
            }
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        List listE2 = e();
        g(context, b(file), this.b, listE2);
        arrayList = listE2;
        Log.i("MultiDex", "load found " + arrayList.size() + " secondary dex files");
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f.release();
        this.e.close();
        this.d.close();
    }
}
