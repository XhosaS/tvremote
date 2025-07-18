package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugw implements ugs {
    public final ujk a;
    public final Executor b;

    public ugw(ujk ujkVar, Executor executor) {
        this.a = ujkVar;
        this.b = executor;
    }

    public static plu b(plu pluVar, Uri uri, yqt yqtVar) {
        HashMap map = new HashMap(DesugarCollections.unmodifiableMap(pluVar.b));
        map.remove(uri.toString());
        if (yqtVar.g()) {
            String string = uri.toString();
            Object objC = yqtVar.c();
            plw plwVar = plw.a;
            plv plvVar = new plv();
            jsq jsqVar = (jsq) objC;
            String str = jsqVar.a;
            if ((plvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                plvVar.y();
            }
            plw plwVar2 = (plw) plvVar.b;
            plwVar2.b |= 1;
            plwVar2.c = str;
            abzy abzyVarE = acbj.e(jsqVar.b, 0);
            if ((plvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                plvVar.y();
            }
            plw plwVar3 = (plw) plvVar.b;
            abzyVarE.getClass();
            plwVar3.d = abzyVarE;
            plwVar3.b |= 2;
            map.put(string, (plw) plvVar.v());
        }
        pls plsVar = new pls();
        plsVar.B(pluVar);
        if ((plsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            plsVar.y();
        }
        plu pluVar2 = (plu) plsVar.b;
        abyl abylVar = pluVar2.b;
        if (!abylVar.b) {
            pluVar2.b = abylVar.a();
        }
        pluVar2.b.clear();
        if ((plsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            plsVar.y();
        }
        plu pluVar3 = (plu) plsVar.b;
        abyl abylVar2 = pluVar3.b;
        if (!abylVar2.b) {
            pluVar3.b = abylVar2.a();
        }
        pluVar3.b.putAll(map);
        return (plu) plsVar.v();
    }

    public static yqt c(plu pluVar, Uri uri) {
        String string = uri.toString();
        if (!DesugarCollections.unmodifiableMap(pluVar.b).containsKey(string)) {
            return ypv.a;
        }
        plw plwVar = (plw) DesugarCollections.unmodifiableMap(pluVar.b).get(string);
        String str = plwVar.c;
        abzy abzyVar = plwVar.d;
        if (abzyVar == null) {
            abzyVar = abzy.a;
        }
        acbj.f(abzyVar);
        return yqt.i(new jsq(str, abzyVar.b));
    }

    @Override // defpackage.ugs
    public final zyd a(final Uri uri) {
        return this.a.a(new yqi() { // from class: ugv
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                plu pluVar = (plu) obj;
                Uri uri2 = uri;
                return !ugw.c(pluVar, uri2).g() ? pluVar : ugw.b(pluVar, uri2, ypv.a);
            }
        }, this.b);
    }
}
