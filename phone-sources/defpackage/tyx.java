package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tyx extends tyy implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;

    public tyx(int i) {
        this.a = i;
    }

    @Override // defpackage.tyy
    public final int a() {
        return this.a;
    }

    @Override // defpackage.tyy
    public final int b() {
        return 32;
    }

    @Override // defpackage.tyy
    public final boolean c(tyy tyyVar) {
        return this.a == tyyVar.a();
    }

    @Override // defpackage.tyy
    public final byte[] d() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }
}
