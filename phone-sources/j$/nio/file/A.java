package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes4.dex */
public abstract class A {
    public static final z a = new z(0, "OVERFLOW", Object.class);
    public static final z b;
    public static final z c;
    public static final z d;

    static {
        Class<Path> cls = Path.class;
        b = new z(0, "ENTRY_CREATE", cls);
        int i = 0;
        c = new z(i, "ENTRY_DELETE", cls);
        d = new z(i, "ENTRY_MODIFY", cls);
    }

    public static /* synthetic */ LinkOption[] h(java.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        LinkOption[] linkOptionArr2 = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ D[] i(WatchEvent.Kind[] kindArr) {
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        D[] dArr = new D[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = AbstractC0040a.b(kindArr[i]);
        }
        return dArr;
    }

    public static /* synthetic */ G[] j(WatchEvent.Modifier[] modifierArr) {
        if (modifierArr == null) {
            return null;
        }
        int length = modifierArr.length;
        G[] gArr = new G[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Modifier modifier = modifierArr[i];
            gArr[i] = modifier == null ? null : modifier instanceof F ? ((F) modifier).a : new E(modifier);
        }
        return gArr;
    }

    public static /* synthetic */ java.nio.file.LinkOption[] k(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        java.nio.file.LinkOption[] linkOptionArr2 = new java.nio.file.LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = AbstractC0040a.c(linkOptionArr[i]);
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ WatchEvent.Kind[] l(D[] dArr) {
        if (dArr == null) {
            return null;
        }
        int length = dArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            kindArr[i] = AbstractC0040a.f(dArr[i]);
        }
        return kindArr;
    }

    public static /* synthetic */ WatchEvent.Modifier[] m(G[] gArr) {
        if (gArr == null) {
            return null;
        }
        int length = gArr.length;
        WatchEvent.Modifier[] modifierArr = new WatchEvent.Modifier[length];
        for (int i = 0; i < length; i++) {
            G g = gArr[i];
            modifierArr[i] = g == null ? null : g instanceof E ? ((E) g).a : new F(g);
        }
        return modifierArr;
    }

    public abstract Object a(String str);

    public abstract long b();

    public abstract j$.nio.file.attribute.D c(Class cls);

    public abstract long d();

    public abstract long e();

    public abstract long f();

    public abstract boolean g();

    public abstract String n();

    public abstract boolean o(Class cls);

    public abstract boolean p(String str);

    public abstract String q();
}
