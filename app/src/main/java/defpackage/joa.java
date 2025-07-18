package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class joa extends jou {
    public int a;
    public String b;
    public byte c;

    @Override // defpackage.jou
    public final jov a() {
        if (this.c == 1) {
            return new job(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: state");
    }
}
