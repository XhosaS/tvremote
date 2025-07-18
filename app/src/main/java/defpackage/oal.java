package defpackage;

import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import com.google.android.libraries.elements.interfaces.MaterializationResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oal {
    public static final oal A = O().g();

    public static oak O() {
        nyw nywVar = new nyw();
        nywVar.b(true);
        nywVar.v = (short) (nywVar.v | 32);
        nywVar.b(true);
        nywVar.g = true;
        nywVar.v = (short) (nywVar.v | 16);
        nywVar.e = ofl.a;
        nywVar.h = new StringBuilder();
        nywVar.v = (short) (nywVar.v | 8);
        nywVar.b(false);
        nywVar.f(false);
        nywVar.d(true);
        nywVar.j = "";
        nywVar.c(0);
        nywVar.b = -1;
        short s = nywVar.v;
        nywVar.d = -1;
        nywVar.c = -1;
        nywVar.v = (short) (s | 7);
        nywVar.i = "";
        return nywVar;
    }

    public abstract void A();

    protected abstract void B();

    protected abstract void C();

    protected abstract void D();

    public abstract void E();

    public abstract void F();

    public abstract void G();

    public abstract void H();

    @Deprecated
    public abstract void I();

    public abstract void J();

    public abstract void K();

    public abstract void L();

    public abstract void M();

    public abstract void N();

    public final ocq P() {
        ocj ocjVarG = g();
        if (ocjVarG != null) {
            return ((nza) ocjVarG).e;
        }
        return null;
    }

    public final acxn Q() {
        if (t() == null) {
            return null;
        }
        return (acxn) t().get();
    }

    public final synchronized String R(String str) {
        StringBuilder sbR = r();
        if (sbR == null) {
            return str;
        }
        return sbR.toString();
    }

    public final synchronized String S(String str) {
        String strR = R("");
        int iLastIndexOf = strR == null ? -1 : strR.lastIndexOf("eml");
        if (strR == null || iLastIndexOf == -1) {
            return str;
        }
        int iLastIndexOf2 = strR.lastIndexOf(124, iLastIndexOf);
        int iIndexOf = strR.indexOf(124, iLastIndexOf);
        int i = iLastIndexOf2 + 1;
        if (iIndexOf == -1) {
            iIndexOf = strR.length();
        }
        return strR.substring(i, iIndexOf);
    }

    public final synchronized void T(String... strArr) {
        StringBuilder sbR = r();
        if (sbR != null) {
            for (int i = 0; i < 2; i++) {
                sbR.append(strArr[i]);
            }
        }
    }

    public final boolean U() {
        ocj ocjVarG = g();
        return ocjVarG != null ? ((nza) ocjVarG).f : z();
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract BlockRegistryProvider e();

    public abstract obj f();

    public abstract ocj g();

    public abstract MaterializationResult h();

    public abstract ofl i();

    public abstract aghb j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public abstract String n();

    public abstract String o();

    public abstract String p();

    public abstract String q();

    protected abstract StringBuilder r();

    public abstract WeakReference s();

    protected abstract WeakReference t();

    public abstract WeakReference u();

    public abstract AtomicReference v();

    protected abstract boolean w();

    public abstract boolean x();

    public abstract boolean y();

    protected abstract boolean z();
}
