package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class c extends au implements ak {
    public final am a;
    boolean b;
    int c;

    public c(am amVar) {
        amVar.e();
        y yVar = amVar.l;
        if (yVar != null) {
            yVar.c.getClassLoader();
        }
        this.c = -1;
        this.a = amVar;
    }

    final void a(int i) {
        if (this.j) {
            if (am.S(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                at atVar = (at) arrayList.get(i2);
                q qVar = atVar.b;
                if (qVar != null) {
                    qVar.v += i;
                    if (am.S(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + atVar.b + " to " + atVar.b.v);
                    }
                }
            }
        }
    }

    final void b() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            at atVar = (at) arrayList.get(size);
            if (atVar.c) {
                int i = size - 1;
                if (atVar.a == 8) {
                    atVar.c = false;
                    arrayList.remove(i);
                    size = i;
                } else {
                    int i2 = atVar.b.B;
                    atVar.a = 2;
                    atVar.c = false;
                    while (i >= 0) {
                        at atVar2 = (at) arrayList.get(i);
                        if (atVar2.c && atVar2.b.B == i2) {
                            arrayList.remove(i);
                            size--;
                        }
                        i--;
                    }
                }
            }
        }
    }

    public final void c(String str, PrintWriter printWriter) {
        d(str, printWriter, true);
    }

    public final void d(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
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
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
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
            at atVar = (at) arrayList.get(i);
            switch (atVar.a) {
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
                    str2 = "cmd=" + atVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(atVar.b);
            if (z) {
                if (atVar.d != 0 || atVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(atVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(atVar.e));
                }
                if (atVar.f != 0 || atVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(atVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(atVar.g));
                }
            }
        }
    }

    @Override // defpackage.ak
    public final boolean e(ArrayList arrayList, ArrayList arrayList2) {
        if (am.S(2)) {
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

    @Override // defpackage.au
    public final void f(int i, q qVar, String str) {
        String str2 = qVar.S;
        if (str2 != null) {
            up.a(qVar, str2);
        }
        Class<?> cls = qVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = qVar.C;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + qVar + ": was " + qVar.C + " now " + str);
            }
            qVar.C = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + qVar + " with tag " + str + " to container view with no id");
            }
            int i2 = qVar.A;
            if (i2 != 0 && i2 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + qVar + ": was " + qVar.A + " now " + i);
            }
            qVar.A = i;
            qVar.B = i;
        }
        h(new at(1, qVar));
        qVar.w = this.a;
    }

    final void g(boolean z) {
        if (this.b) {
            throw new IllegalStateException("commit already called");
        }
        if (am.S(2)) {
            toString();
            Log.v("FragmentManager", "Commit: ".concat(toString()));
            PrintWriter printWriter = new PrintWriter(new ay());
            c("  ", printWriter);
            printWriter.close();
        }
        this.b = true;
        if (this.j) {
            this.c = this.a.h.getAndIncrement();
        } else {
            this.c = -1;
        }
        if (z) {
            this.a.ac(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }
}
