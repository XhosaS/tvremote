package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.EventParams;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kum {
    final String a;
    final String b;
    final String c;
    final long d;
    final long e;
    final EventParams f;

    public kum(lbk lbkVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        EventParams eventParams;
        kkk.h(str2);
        kkk.h(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.b("Event created with reverse previous/current timestamps. appId", lab.b(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            eventParams = new EventParams(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    lab labVar2 = lbkVar.f;
                    lbkVar.o(labVar2);
                    labVar2.c.a("Param name can't be null");
                    it.remove();
                } else {
                    lio lioVar = lbkVar.i;
                    lbkVar.m(lioVar);
                    Object objA = lioVar.A(next, bundle2.get(next));
                    if (objA == null) {
                        lab labVar3 = lbkVar.f;
                        lbkVar.o(labVar3);
                        labVar3.f.b("Param value can't be null", lbkVar.j.d(next));
                        it.remove();
                    } else {
                        lio lioVar2 = lbkVar.i;
                        lbkVar.m(lioVar2);
                        lioVar2.N(bundle2, next, objA);
                    }
                }
            }
            eventParams = new EventParams(bundle2);
        }
        this.f = eventParams;
    }

    public final String toString() {
        return "Event{appId='" + this.a + "', name='" + this.b + "', params=" + this.f.a.toString() + "}";
    }

    public kum(lbk lbkVar, String str, String str2, String str3, long j, long j2, EventParams eventParams) {
        kkk.h(str2);
        kkk.h(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.c("Event created with reverse previous/current timestamps. appId, name", lab.b(str2), lab.b(str3));
        }
        this.f = eventParams;
    }
}
