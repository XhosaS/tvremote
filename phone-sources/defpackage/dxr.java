package defpackage;

import android.os.Looper;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxr {
    public final dxv a;
    private final dvk b;

    public dxr() {
        throw null;
    }

    public static dxr a(dvk dvkVar) {
        return new dxr(dvkVar, ((dxd) dvkVar).getViewModelStore());
    }

    public static boolean b(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    public final void c(int i, dxq dxqVar) {
        dxv dxvVar = this.a;
        if (dxvVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        dxs dxsVarA = dxvVar.a(i);
        if (b(2)) {
            toString();
        }
        if (dxsVarA != null) {
            if (b(3)) {
                Objects.toString(dxsVarA);
            }
            dxsVarA.p(this.b, dxqVar);
            return;
        }
        try {
            dxvVar.c = true;
            dxy dxyVarA = dxqVar.a();
            if (dxyVarA.getClass().isMemberClass() && !Modifier.isStatic(dxyVarA.getClass().getModifiers())) {
                throw new IllegalArgumentException(a.cm(dxyVarA, "Object returned from onCreateLoader must not be a non-static inner member class: "));
            }
            dxs dxsVar = new dxs(i, dxyVarA);
            if (b(3)) {
                dxsVar.toString();
            }
            dxvVar.b.h(i, dxsVar);
            dxvVar.b();
            dxsVar.p(this.b, dxqVar);
        } catch (Throwable th) {
            this.a.b();
            throw th;
        }
    }

    @Deprecated
    public final void d(String str, PrintWriter printWriter) {
        kp kpVar = this.a.b;
        if (kpVar.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String strValueOf = String.valueOf(str);
            for (int i = 0; i < kpVar.c(); i++) {
                String strConcat = strValueOf.concat("    ");
                dxs dxsVar = (dxs) kpVar.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(kpVar.b(i));
                printWriter.print(": ");
                printWriter.println(dxsVar.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(dxsVar.g);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(strConcat);
                printWriter.print("mLoader=");
                dxy dxyVar = dxsVar.h;
                printWriter.println(dxyVar);
                dxyVar.e(strConcat.concat("  "), printWriter);
                if (dxsVar.i != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(dxsVar.i);
                    dxt dxtVar = dxsVar.i;
                    printWriter.print(strConcat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(dxtVar.c);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                printWriter.println(dxy.j(dxsVar.a()));
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(dxsVar.l());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        dvk dvkVar = this.b;
        sb.append(dvkVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(dvkVar)));
        sb.append("}}");
        return sb.toString();
    }

    public dxr(dvk dvkVar, dxc dxcVar) {
        this.b = dvkVar;
        this.a = (dxv) new dxa(dxcVar, dxv.a).a(dxv.class);
    }
}
