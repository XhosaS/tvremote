package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zrt extends zrx {
    public final int b;
    public zru c;
    private final boolean d;
    private final List e;
    private final List f;
    private final long g;
    private long h;

    private zrt(int i, List list, List list2, long j, long j2, boolean z) {
        super(true);
        this.h = 0L;
        this.b = i;
        this.e = DesugarCollections.unmodifiableList(list);
        this.f = DesugarCollections.unmodifiableList(list2);
        this.h = j;
        this.g = j2;
        this.d = z;
    }

    public static zrt a(Object obj) {
        Throwable th;
        DataInputStream dataInputStream;
        if (obj instanceof zrt) {
            return (zrt) obj;
        }
        if (!(obj instanceof DataInputStream)) {
            if (!(obj instanceof byte[])) {
                if (obj instanceof InputStream) {
                    return a(vxr.aO((InputStream) obj));
                }
                throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(String.valueOf(obj))));
            }
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = null;
            }
            try {
                zrt zrtVarA = a(dataInputStream);
                dataInputStream.close();
                return zrtVarA;
            } catch (Throwable th3) {
                th = th3;
                if (dataInputStream == null) {
                    throw th;
                }
                dataInputStream.close();
                throw th;
            }
        }
        DataInputStream dataInputStream2 = (DataInputStream) obj;
        if (dataInputStream2.readInt() != 0) {
            throw new IllegalStateException("unknown version for hss private key");
        }
        int i = dataInputStream2.readInt();
        long j = dataInputStream2.readLong();
        long j2 = dataInputStream2.readLong();
        boolean z = dataInputStream2.readBoolean();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(zrz.a(obj));
        }
        for (int i3 = 0; i3 < i - 1; i3++) {
            arrayList2.add(zsb.a(obj));
        }
        return new zrt(i, arrayList, arrayList2, j, j2, z);
    }

    public final synchronized zru b() {
        return new zru(this.b, ((zrz) this.e.get(0)).b());
    }

    protected final Object clone() {
        try {
            return a(s());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zrt zrtVar = (zrt) obj;
        if (this.b == zrtVar.b && this.d == zrtVar.d && this.g == zrtVar.g && this.h == zrtVar.h && this.e.equals(zrtVar.e)) {
            return this.f.equals(zrtVar.f);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.b * 31) + (this.d ? 1 : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        long j = this.h;
        long j2 = j ^ (j >>> 32);
        long j3 = this.g;
        return (((iHashCode * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) j2);
    }

    @Override // defpackage.zrx, defpackage.zxn
    public final synchronized byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream;
        byteArrayOutputStream = new ByteArrayOutputStream();
        wef.T(0, byteArrayOutputStream);
        wef.T(this.b, byteArrayOutputStream);
        wef.U(this.h, byteArrayOutputStream);
        wef.U(this.g, byteArrayOutputStream);
        byteArrayOutputStream.write(this.d ? 1 : 0);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            wef.Q((zrz) it.next(), byteArrayOutputStream);
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            wef.Q((zsb) it2.next(), byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
