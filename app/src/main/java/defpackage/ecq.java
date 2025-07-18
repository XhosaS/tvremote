package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ecq extends ect implements Cloneable, dui, dtn {
    private static final AtomicInteger m = new AtomicInteger(0);
    public ecq a;
    public boolean b;
    public ecr c;
    dtu d;
    public Map e;
    public final String f;
    public int i;
    public List j;
    public String k;
    public final String l;
    public final int h = m.getAndIncrement();
    public dxx g = b();

    protected ecq(String str) {
        this.f = str;
        this.l = str;
    }

    static Map d(ecq ecqVar) {
        HashMap map = new HashMap();
        if (ecqVar != null) {
            List list = ecqVar.j;
            if (list == null) {
                throw new IllegalStateException(a.t(ecqVar, "Children of current section ", " is null!"));
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ecq ecqVar2 = (ecq) list.get(i);
                map.put(ecqVar2.k, new afg(ecqVar2, Integer.valueOf(i)));
            }
        }
        return map;
    }

    public static void e(ecq ecqVar) {
        ecqVar.b = true;
        ecq ecqVar2 = ecqVar.a;
        if (ecqVar2 != null) {
            e(ecqVar2);
        }
    }

    protected dxx b() {
        return null;
    }

    public ecq c(boolean z) {
        try {
            ecq ecqVar = (ecq) super.clone();
            if (!z) {
                if (ecqVar.j != null) {
                    ecqVar.j = new ArrayList();
                }
                ecqVar.i = 0;
                ecqVar.b = false;
                ecqVar.e = null;
            }
            return ecqVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dtn
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ecq ecqVar) {
        throw null;
    }

    @Override // defpackage.dui
    public final dtq n() {
        return this;
    }
}
