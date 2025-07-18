package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bfh extends bfc {
    public final bcl a;
    public final bfg b;

    public bfh(bcl bclVar, bel belVar) {
        this.a = bclVar;
        bek bekVar = new bek(belVar, bfg.a);
        agwj agwjVar = agwi.a;
        this.b = (bfg) bekVar.a(new agvq(bfg.class));
    }

    public static boolean b(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        bcl bclVar = this.a;
        sb.append(bclVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(bclVar)));
        sb.append("}}");
        return sb.toString();
    }
}
