package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class at extends cy implements co {
    final cr a;
    boolean b;
    int c;

    public at(cr crVar) {
        crVar.i();
        cd cdVar = crVar.m;
        if (cdVar != null) {
            cdVar.c.getClassLoader();
        }
        this.c = -1;
        this.a = crVar;
    }

    @Override // defpackage.cy
    public final int a() {
        return b(false, true);
    }

    final int b(boolean z, boolean z2) {
        if (this.b) {
            throw new IllegalStateException("commit already called");
        }
        if (cr.Y(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new dj());
            h("  ", printWriter);
            printWriter.close();
        }
        this.b = true;
        if (this.j) {
            this.c = this.a.i.getAndIncrement();
        } else {
            this.c = -1;
        }
        if (z2) {
            this.a.H(this, z);
        }
        return this.c;
    }

    final void c(int i) {
        if (this.j) {
            if (cr.Y(2)) {
                toString();
            }
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cx cxVar = (cx) arrayList.get(i2);
                bv bvVar = cxVar.b;
                if (bvVar != null) {
                    bvVar.mBackStackNesting += i;
                    if (cr.Y(2)) {
                        Objects.toString(cxVar.b);
                        int i3 = cxVar.b.mBackStackNesting;
                    }
                }
            }
        }
    }

    final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            cx cxVar = (cx) arrayList.get(size);
            if (cxVar.c) {
                int i = size - 1;
                if (cxVar.a == 8) {
                    cxVar.c = false;
                    arrayList.remove(i);
                    size = i;
                } else {
                    int i2 = cxVar.b.mContainerId;
                    cxVar.a = 2;
                    cxVar.c = false;
                    while (i >= 0) {
                        cx cxVar2 = (cx) arrayList.get(i);
                        if (cxVar2.c && cxVar2.b.mContainerId == i2) {
                            arrayList.remove(i);
                            size--;
                        }
                        i--;
                    }
                }
            }
        }
    }

    @Override // defpackage.cy
    public final void e() {
        t();
        this.a.I(this, false);
    }

    @Override // defpackage.cy
    public final void f() {
        t();
        this.a.I(this, true);
    }

    @Override // defpackage.cy
    public final void g(int i, bv bvVar, String str, int i2) {
        String str2 = bvVar.mPreviousWho;
        if (str2 != null) {
            dia.a(bvVar, str2);
        }
        Class<?> cls = bvVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = bvVar.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + bvVar + ": was " + bvVar.mTag + " now " + str);
            }
            bvVar.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + bvVar + " with tag " + str + " to container view with no id");
            }
            int i3 = bvVar.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + bvVar + ": was " + bvVar.mFragmentId + " now " + i);
            }
            bvVar.mFragmentId = i;
            bvVar.mContainerId = i;
        }
        o(new cx(i2, bvVar));
        bvVar.mFragmentManager = this.a;
    }

    public final void h(String str, PrintWriter printWriter) {
        i(str, printWriter, true);
    }

    public final void i(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cx cxVar = (cx) arrayList.get(i);
            switch (cxVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + cxVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(cxVar.b);
            if (z) {
                if (cxVar.d != 0 || cxVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(cxVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(cxVar.e));
                }
                if (cxVar.f != 0 || cxVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(cxVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(cxVar.g));
                }
            }
        }
    }

    @Override // defpackage.co
    public final boolean j(ArrayList arrayList, ArrayList arrayList2) {
        if (cr.Y(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.j) {
            return true;
        }
        this.a.c.add(this);
        return true;
    }

    @Override // defpackage.cy
    public final boolean k() {
        return this.d.isEmpty();
    }

    @Override // defpackage.cy
    public final void l() {
        b(true, true);
    }

    @Override // defpackage.cy
    public final void m(bv bvVar) {
        cr crVar = bvVar.mFragmentManager;
        if (crVar == null || crVar == this.a) {
            o(new cx(3, bvVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + bvVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.cy
    public final void n(bv bvVar, dvd dvdVar) {
        cr crVar = bvVar.mFragmentManager;
        cr crVar2 = this.a;
        if (crVar != crVar2) {
            Objects.toString(crVar2);
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ".concat(crVar2.toString()));
        }
        if (dvdVar == dvd.b && bvVar.mState >= 0) {
            throw new IllegalArgumentException(a.cj(dvdVar, "Cannot set maximum Lifecycle to ", " after the Fragment has been created"));
        }
        if (dvdVar == dvd.a) {
            throw new IllegalArgumentException(a.cj(dvdVar, "Cannot set maximum Lifecycle to ", ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."));
        }
        o(new cx(bvVar, dvdVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l);
        }
        sb.append("}");
        return sb.toString();
    }
}
