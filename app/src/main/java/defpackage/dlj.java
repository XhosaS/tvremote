package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dlj implements ddp {
    private final byte[] a;

    public dlj(byte[] bArr) {
        dqk.d(bArr, "Argument must not be null");
        this.a = bArr;
    }

    @Override // defpackage.ddp
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.ddp
    public final Class b() {
        return byte[].class;
    }

    @Override // defpackage.ddp
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.ddp
    public final void e() {
    }
}
