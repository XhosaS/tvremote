package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ab extends dp implements cy, db {
    final de a;
    boolean b;
    public int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ab(de deVar) {
        cd cdVarE = deVar.e();
        ce ceVar = deVar.n;
        super(cdVarE, ceVar != null ? ceVar.c.getClassLoader() : null);
        this.c = -1;
        this.a = deVar;
    }

    @Override // defpackage.cy
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cy
    public final String b() {
        return this.l;
    }

    final void c(int i) {
        if (this.j) {
            if (de.S(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0000do c0000do = (C0000do) arrayList.get(i2);
                bq bqVar = c0000do.b;
                if (bqVar != null) {
                    bqVar.B += i;
                    if (de.S(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c0000do.b + " to " + c0000do.b.B);
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
            C0000do c0000do = (C0000do) arrayList.get(size);
            if (c0000do.c) {
                int i = size - 1;
                if (c0000do.a == 8) {
                    c0000do.c = false;
                    arrayList.remove(i);
                    size = i;
                } else {
                    int i2 = c0000do.b.H;
                    c0000do.a = 2;
                    c0000do.c = false;
                    while (i >= 0) {
                        C0000do c0000do2 = (C0000do) arrayList.get(i);
                        if (c0000do2.c && c0000do2.b.H == i2) {
                            arrayList.remove(i);
                            size--;
                        }
                        i--;
                    }
                }
            }
        }
    }

    @Override // defpackage.dp
    public final void e() {
        p();
        this.a.D(this, false);
    }

    @Override // defpackage.dp
    public final void f(int i, bq bqVar, String str, int i2) {
        String str2 = bqVar.Y;
        if (str2 != null) {
            asx.d(bqVar, str2);
        }
        Class<?> cls = bqVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = bqVar.I;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + bqVar + ": was " + bqVar.I + " now " + str);
            }
            bqVar.I = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + bqVar + " with tag " + str + " to container view with no id");
            }
            int i3 = bqVar.G;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + bqVar + ": was " + bqVar.G + " now " + i);
            }
            bqVar.G = i;
            bqVar.H = i;
        }
        l(new C0000do(i2, bqVar));
        bqVar.C = this.a;
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
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
            C0000do c0000do = (C0000do) arrayList.get(i);
            switch (c0000do.a) {
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
                    str2 = "cmd=" + c0000do.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0000do.b);
            if (z) {
                if (c0000do.d != 0 || c0000do.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0000do.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0000do.e));
                }
                if (c0000do.f != 0 || c0000do.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0000do.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0000do.g));
                }
            }
        }
    }

    @Override // defpackage.db
    public final boolean h(ArrayList arrayList, ArrayList arrayList2) {
        if (de.S(2)) {
            toString();
            Log.v("FragmentManager", "Run: ".concat(toString()));
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.j) {
            return true;
        }
        this.a.c.add(this);
        return true;
    }

    @Override // defpackage.dp
    public final void i() {
        j(false, true);
    }

    public final void j(boolean z, boolean z2) {
        if (this.b) {
            throw new IllegalStateException("commit already called");
        }
        if (de.S(2)) {
            toString();
            Log.v("FragmentManager", "Commit: ".concat(toString()));
            PrintWriter printWriter = new PrintWriter(new ea());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.b = true;
        if (this.j) {
            this.c = this.a.i.getAndIncrement();
        } else {
            this.c = -1;
        }
        if (z2) {
            this.a.C(this, z);
        }
    }

    @Override // defpackage.dp
    public final void k(bq bqVar) {
        de deVar = bqVar.C;
        if (deVar == null || deVar == this.a) {
            l(new C0000do(3, bqVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + bqVar.toString() + " is already attached to a FragmentManager.");
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
