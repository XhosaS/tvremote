package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qds {
    public final prk a;
    public final pxv b;
    public final ueg c;
    public final qbv d;
    public final Context e;
    public final pkn f;
    public final yqt g;
    public final Executor h;

    public qds(Context context, prk prkVar, pxv pxvVar, ueg uegVar, qbv qbvVar, pkn pknVar, yqt yqtVar, Executor executor) {
        this.e = context;
        this.a = prkVar;
        this.b = pxvVar;
        this.c = uegVar;
        this.d = qbvVar;
        this.f = pknVar;
        this.g = yqtVar;
        this.h = executor;
    }

    public final String a(piy piyVar) {
        return piyVar.d + "|" + piyVar.e;
    }

    public final Set b(Map map, String str) {
        Set set = (Set) map.get(str);
        if (set != null) {
            return set;
        }
        map.put(str, new HashSet());
        return (Set) map.get(str);
    }
}
