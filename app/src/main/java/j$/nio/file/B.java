package j$.nio.file;

import java.nio.file.LinkOption;
import java.nio.file.WatchEvent;

/* loaded from: classes3.dex */
public abstract class B {
    public static final A a = new A(0, "OVERFLOW", Object.class);
    public static final A b;
    public static final A c;
    public static final A d;

    static {
        Class<Path> cls = Path.class;
        b = new A(0, "ENTRY_CREATE", cls);
        int i = 0;
        c = new A(i, "ENTRY_DELETE", cls);
        d = new A(i, "ENTRY_MODIFY", cls);
    }

    public static /* synthetic */ EnumC0038l[] h(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        EnumC0038l[] enumC0038lArr = new EnumC0038l[length];
        for (int i = 0; i < length; i++) {
            enumC0038lArr[i] = linkOptionArr[i] == null ? null : EnumC0038l.NOFOLLOW_LINKS;
        }
        return enumC0038lArr;
    }

    public static /* synthetic */ E[] i(WatchEvent.Kind[] kindArr) {
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        E[] eArr = new E[length];
        for (int i = 0; i < length; i++) {
            eArr[i] = AbstractC0002a.b(kindArr[i]);
        }
        return eArr;
    }

    public static /* synthetic */ H[] j(WatchEvent.Modifier[] modifierArr) {
        if (modifierArr == null) {
            return null;
        }
        int length = modifierArr.length;
        H[] hArr = new H[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Modifier modifier = modifierArr[i];
            hArr[i] = modifier == null ? null : modifier instanceof G ? ((G) modifier).a : new F(modifier);
        }
        return hArr;
    }

    public static /* synthetic */ LinkOption[] k(EnumC0038l[] enumC0038lArr) {
        if (enumC0038lArr == null) {
            return null;
        }
        int length = enumC0038lArr.length;
        LinkOption[] linkOptionArr = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr[i] = AbstractC0002a.c(enumC0038lArr[i]);
        }
        return linkOptionArr;
    }

    public static /* synthetic */ WatchEvent.Kind[] l(E[] eArr) {
        if (eArr == null) {
            return null;
        }
        int length = eArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            kindArr[i] = AbstractC0002a.f(eArr[i]);
        }
        return kindArr;
    }

    public static /* synthetic */ WatchEvent.Modifier[] m(H[] hArr) {
        if (hArr == null) {
            return null;
        }
        int length = hArr.length;
        WatchEvent.Modifier[] modifierArr = new WatchEvent.Modifier[length];
        for (int i = 0; i < length; i++) {
            H h = hArr[i];
            modifierArr[i] = h == null ? null : h instanceof F ? ((F) h).a : new G(h);
        }
        return modifierArr;
    }

    public abstract Object a(String str);

    public abstract long b();

    public abstract j$.nio.file.attribute.E c(Class cls);

    public abstract long d();

    public abstract long e();

    public abstract long f();

    public abstract boolean g();

    public abstract String n();

    public abstract boolean o(Class cls);

    public abstract boolean p(String str);

    public abstract String q();
}
