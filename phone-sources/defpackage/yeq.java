package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yeq implements xsg {
    private final vvj a;

    public yeq(vvj vvjVar) {
        this.a = vvjVar;
    }

    @Override // defpackage.xsg
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        try {
            return this.a.u().i(bArr, yer.a);
        } catch (vuq e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.xsg
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((vvj) obj).h();
    }
}
