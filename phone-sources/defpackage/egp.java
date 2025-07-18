package defpackage;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egp implements egq {
    private boolean a;
    private egu b;
    private final dwi c;

    public egp(File file) {
        a.ab(true);
        a.H(true);
        this.c = new dwi(file);
    }

    private static final int i(egn egnVar, int i) {
        int iHashCode;
        int iHashCode2 = ((egnVar.a * 31) + egnVar.b.hashCode()) * 31;
        if (i < 2) {
            long jO = clw.O(egnVar.e);
            iHashCode = (int) (jO ^ (jO >>> 32));
        } else {
            iHashCode = egnVar.e.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    @Override // defpackage.egq
    public final void a() {
        this.c.t();
    }

    @Override // defpackage.egq
    public final void c(HashMap map, SparseArray sparseArray) throws Throwable {
        DataInputStream dataInputStream;
        egt egtVarC;
        a.ab(!this.a);
        dwi dwiVar = this.c;
        if (dwiVar.u()) {
            DataInputStream dataInputStream2 = null;
            try {
                Object obj = dwiVar.b;
                if (((File) obj).exists()) {
                    Object obj2 = dwiVar.a;
                    ((File) obj2).delete();
                    ((File) obj).renameTo((File) obj2);
                }
                dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream((File) dwiVar.a)));
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                int i = dataInputStream.readInt();
                if (i >= 0 && i <= 2 && (dataInputStream.readInt() & 1) == 0) {
                    int i2 = dataInputStream.readInt();
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        int i5 = dataInputStream.readInt();
                        String utf = dataInputStream.readUTF();
                        if (i < 2) {
                            long j = dataInputStream.readLong();
                            dwi dwiVar2 = new dwi((byte[]) null);
                            dwi.v(dwiVar2, j);
                            egtVarC = egt.a.a(dwiVar2);
                        } else {
                            egtVarC = egr.c(dataInputStream);
                        }
                        egn egnVar = new egn(i5, utf, egtVarC);
                        String str = egnVar.b;
                        map.put(str, egnVar);
                        sparseArray.put(egnVar.a, str);
                        i3 += i(egnVar, i);
                    }
                    int i6 = dataInputStream.readInt();
                    int i7 = dataInputStream.read();
                    if (i6 == i3 && i7 == -1) {
                        edt.ac(dataInputStream);
                        return;
                    }
                }
                edt.ac(dataInputStream);
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    edt.ac(dataInputStream2);
                }
                map.clear();
                sparseArray.clear();
                this.c.t();
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    edt.ac(dataInputStream2);
                }
                throw th;
            }
            map.clear();
            sparseArray.clear();
            this.c.t();
        }
    }

    @Override // defpackage.egq
    public final void d(egn egnVar, boolean z) {
        this.a = true;
    }

    @Override // defpackage.egq
    public final void e(egn egnVar) {
        this.a = true;
    }

    @Override // defpackage.egq
    public final void f(HashMap map) throws Throwable {
        DataOutputStream dataOutputStream;
        ecj ecjVar;
        try {
            dwi dwiVar = this.c;
            Object obj = dwiVar.a;
            if (((File) obj).exists()) {
                Object obj2 = dwiVar.b;
                if (((File) obj2).exists()) {
                    ((File) obj).delete();
                } else {
                    if (!((File) obj).renameTo((File) obj2)) {
                        edb.e("AtomicFile", "Couldn't rename file " + obj.toString() + " to backup file " + obj2.toString());
                    }
                }
            }
            try {
                ecjVar = new ecj((File) obj);
            } catch (FileNotFoundException e) {
                Object obj3 = dwiVar.a;
                File parentFile = ((File) obj3).getParentFile();
                if (parentFile == null || !parentFile.mkdirs()) {
                    throw new IOException("Couldn't create ".concat(obj3.toString()), e);
                }
                try {
                    ecjVar = new ecj((File) obj3);
                } catch (FileNotFoundException e2) {
                    throw new IOException("Couldn't create ".concat(dwiVar.a.toString()), e2);
                }
            }
            egu eguVar = this.b;
            if (eguVar == null) {
                this.b = new egu(ecjVar);
            } else {
                eguVar.a(ecjVar);
            }
            dataOutputStream = new DataOutputStream(this.b);
        } catch (Throwable th) {
            th = th;
            dataOutputStream = null;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(map.size());
            int i = 0;
            for (egn egnVar : map.values()) {
                dataOutputStream.writeInt(egnVar.a);
                dataOutputStream.writeUTF(egnVar.b);
                egr.f(egnVar.e, dataOutputStream);
                i += i(egnVar, 2);
            }
            dataOutputStream.writeInt(i);
            dwi dwiVar2 = this.c;
            dataOutputStream.close();
            ((File) dwiVar2.b).delete();
            String str = edt.a;
            this.a = false;
        } catch (Throwable th2) {
            th = th2;
            edt.ac(dataOutputStream);
            throw th;
        }
    }

    @Override // defpackage.egq
    public final void g(HashMap map) throws Throwable {
        if (this.a) {
            f(map);
        }
    }

    @Override // defpackage.egq
    public final boolean h() {
        return this.c.u();
    }

    @Override // defpackage.egq
    public final void b(long j) {
    }
}
