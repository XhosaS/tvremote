package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import j$.nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cry {
    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable a(Drawable drawable) {
        return drawable instanceof ctf ? ((ctf) drawable).a() : drawable;
    }

    public static File b(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static void c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            c(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static boolean e(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStreamOpenRawResource = null;
        }
        try {
            boolean zD = d(file, inputStreamOpenRawResource);
            c(inputStreamOpenRawResource);
            return zD;
        } catch (Throwable th2) {
            th = th2;
            c(inputStreamOpenRawResource);
            throw th;
        }
    }

    public static ByteBuffer f(Context context, Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    MappedByteBuffer map = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static /* synthetic */ yfw g(yfw yfwVar, djg djgVar) {
        return djgVar instanceof djp ? new yfw(djgVar, yfwVar.b) : new yfw(yfwVar.a, ((djh) yfwVar.b).a(djgVar));
    }

    public static /* synthetic */ yfw h(yfw yfwVar, djg djgVar) {
        return djgVar instanceof diq ? new yfw(djgVar, yfwVar.b) : new yfw(yfwVar.a, ((djh) yfwVar.b).a(djgVar));
    }

    public static final djs i(djr... djrVarArr) {
        return j((djr[]) Arrays.copyOf(djrVarArr, 0));
    }

    public static final djs j(djr... djrVarArr) {
        int length = djrVarArr.length;
        ArrayList arrayList = new ArrayList(length);
        if (length <= 0) {
            yfw[] yfwVarArr = (yfw[]) arrayList.toArray(new yfw[0]);
            return new djs(yfm.i((yfw[]) Arrays.copyOf(yfwVarArr, yfwVarArr.length)));
        }
        djr djrVar = djrVarArr[0];
        throw null;
    }

    public static final djh k(djh djhVar, djo djoVar) {
        return djhVar.a(new djp(djoVar));
    }

    public static final boolean l(djb djbVar) {
        List list;
        String str = null;
        dsg dsgVar = (dsg) djbVar.a.b(null, anr.m);
        dhq dhqVar = dsgVar != null ? dsgVar.a : null;
        if (dhqVar != null && (list = (List) dhqVar.t(dsh.a)) != null) {
            str = (String) list.get(0);
        }
        return str == null || str.length() == 0;
    }

    public static final void m(djl djlVar, String str, djh djhVar, int i, bao baoVar, int i2, int i3) {
        int i4;
        djh djhVar2;
        int i5;
        int i6 = i3 & 1;
        bao baoVarD = baoVar.d(491792371);
        if (i6 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != ((i2 & 8) == 0 ? baoVarD.F(djlVar) : baoVarD.H(djlVar)) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.F(str) ? 16 : 32;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= true != baoVarD.F(djhVar) ? 128 : 256;
        }
        int i8 = i3 & 8;
        int i9 = i8 != 0 ? 0 : 1;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= true != baoVarD.D(i) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        int i10 = i4 | 24576;
        if ((i10 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            djhVar2 = djhVar;
            i5 = i;
        } else {
            if (i7 != 0) {
                djhVar = djh.b;
            }
            djh djhVar3 = djhVar;
            int i11 = (i9 ^ 1) | i;
            int i12 = i10 & 7168;
            n(djlVar, str, djhVar3, i11, baoVarD, (i10 & 14) | 196608 | (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i10 & 896) | i12 | (i10 & 57344));
            djhVar2 = djhVar3;
            i5 = i11;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new duc(djlVar, str, djhVar2, i5, i2, i3, 1);
        }
    }

    public static final void n(djl djlVar, String str, djh djhVar, int i, bao baoVar, int i2) {
        int i3;
        djh djhVarA;
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(2075067909);
        int i5 = 2;
        int i6 = 4;
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? baoVarD.F(djlVar) : baoVarD.H(djlVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.F(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.F(djhVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.D(i) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != ((32768 & i2) == 0 ? baoVarD.F(null) : baoVarD.H(null)) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != baoVarD.F(null) ? 65536 : 131072;
        }
        if ((74899 & i3) == 74898 && baoVarD.K()) {
            baoVarD.t();
        } else {
            if (str != null) {
                baoVarD.y(884116866);
                baoVarD.y(5004770);
                int i7 = i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                bas basVar = (bas) baoVarD;
                Object objT = basVar.T();
                if (i7 == 32 || objT == ban.a) {
                    objT = new bap(str, 15);
                    basVar.ae(objT);
                }
                basVar.aa();
                dhq dhqVar = new dhq((byte[]) null);
                ((yjv) objT).a(dhqVar);
                djhVarA = djhVar.a(new dsg(dhqVar));
                basVar.aa();
            } else {
                baoVarD.y(884211261);
                ((bas) baoVarD).aa();
                djhVarA = djhVar;
            }
            baoVarD.y(1849434622);
            bas basVar2 = (bas) baoVarD;
            Object objT2 = basVar2.T();
            if (objT2 == ban.a) {
                objT2 = djk.a;
                basVar2.ae(objT2);
            }
            basVar2.aa();
            yjk yjkVar = (yjk) ((ymj) objT2);
            baoVarD.y(-1115894518);
            baoVarD.y(1886828752);
            if (!(basVar2.a instanceof dio)) {
                zy.n();
            }
            baoVarD.w();
            if (basVar2.w) {
                baoVarD.k(new dji(yjkVar, 0));
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, djlVar, new diw(i5));
            beb.a(baoVarD, djhVarA, new diw(3));
            beb.a(baoVarD, new drt(i), new diw(i6));
            beb.a(baoVarD, null, new diw(5));
            beb.a(baoVarD, null, new diw(6));
            baoVarD.o();
            basVar2.aa();
            basVar2.aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new adj(djlVar, str, djhVar, i, i2, 2);
        }
    }
}
