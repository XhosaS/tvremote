package defpackage;

import android.util.Log;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yh {
    public final xf a;
    public final yl b;

    public yh() {
        throw null;
    }

    public static yh a(xf xfVar) {
        return new yh(xfVar, ((yc) xfVar).K());
    }

    public static boolean b(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    @Deprecated
    public final void c(String str, PrintWriter printWriter) {
        mj mjVar = this.b.b;
        if (mjVar.b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            for (int i = 0; i < mjVar.b(); i++) {
                String strConcat = str.concat("    ");
                yi yiVar = (yi) mjVar.c(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(mjVar.a(i));
                printWriter.print(": ");
                printWriter.println(yiVar.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(yiVar.j);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(strConcat);
                printWriter.print("mLoader=");
                yo yoVar = yiVar.k;
                printWriter.println(yoVar);
                String strConcat2 = strConcat.concat("  ");
                printWriter.print(strConcat2);
                printWriter.print("mId=");
                printWriter.print(yoVar.d);
                printWriter.print(" mListener=");
                printWriter.println(yoVar.j);
                if (yoVar.f || yoVar.i) {
                    printWriter.print(strConcat2);
                    printWriter.print("mStarted=");
                    printWriter.print(yoVar.f);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(yoVar.i);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (yoVar.g || yoVar.h) {
                    printWriter.print(strConcat2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(yoVar.g);
                    printWriter.print(" mReset=");
                    printWriter.println(yoVar.h);
                }
                yn ynVar = (yn) yoVar;
                if (ynVar.a != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mTask=");
                    printWriter.print(ynVar.a);
                    printWriter.print(" waiting=");
                    boolean z = ynVar.a.a;
                    printWriter.println(false);
                }
                if (ynVar.b != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(ynVar.b);
                    printWriter.print(" waiting=");
                    boolean z2 = ynVar.b.a;
                    printWriter.println(false);
                }
                if (yiVar.l != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(yiVar.l);
                    yj yjVar = yiVar.l;
                    printWriter.print(strConcat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(yjVar.b);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                Object obj = yiVar.f;
                printWriter.println(yo.e(obj != xk.a ? obj : null));
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(yiVar.d > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        xf xfVar = this.a;
        sb.append(xfVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(xfVar)));
        sb.append("}}");
        return sb.toString();
    }

    public yh(xf xfVar, asv asvVar) {
        this.a = xfVar;
        xz xzVar = yl.a;
        yd ydVar = yd.a;
        ydVar.getClass();
        this.b = (yl) yb.a(yl.class, new cmt(asvVar, xzVar, ydVar));
    }
}
