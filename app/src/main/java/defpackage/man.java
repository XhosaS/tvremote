package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class man extends mbr {
    public adot a;
    public yqt b;
    public yqt c;
    private final yqt d;

    public man() {
        ypv ypvVar = ypv.a;
        this.b = ypvVar;
        this.c = ypvVar;
        this.d = ypvVar;
    }

    @Override // defpackage.mbr
    public final mbs a() {
        adot adotVar = this.a;
        if (adotVar != null) {
            return new mao(adotVar, this.b, this.c, this.d);
        }
        throw new IllegalStateException("Missing required properties: sodaCoreConfig");
    }
}
