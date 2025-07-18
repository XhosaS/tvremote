package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class sx extends st {
    private final int a;

    public sx(int i) {
        this.a = i;
    }

    @Override // defpackage.st
    public final int d() {
        int i = this.a;
        return i | (i << 16);
    }
}
