package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfm<T> {
    public final String a;
    public final yjz b;
    public boolean c;

    public cfm(String str, yjz yjzVar) {
        this.a = str;
        this.b = yjzVar;
    }

    public final String toString() {
        return "AccessibilityKey: ".concat(this.a);
    }

    public /* synthetic */ cfm(String str) {
        this(str, cfl.a);
    }

    public cfm(String str, byte[] bArr) {
        this(str);
        this.c = true;
    }

    public /* synthetic */ cfm(String str, boolean z, yjz yjzVar) {
        this(str, yjzVar);
        this.c = z;
    }
}
