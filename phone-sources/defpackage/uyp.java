package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uyp implements vug {
    UITHEME_DEFAULT(0),
    UITHEME_GOOGLE_MATERIAL(1);

    public final int c;

    uyp(int i) {
        this.c = i;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
