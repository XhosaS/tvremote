package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class efa implements ejm {
    private final Map a;
    private Map b = null;

    protected efa(eez eezVar) {
        this.a = eezVar.a;
    }

    @Override // defpackage.ejm
    public final int a() {
        Map map = this.a;
        if (map == null || !map.containsKey("span_size")) {
            return 1;
        }
        return ((Integer) map.get("span_size")).intValue();
    }

    @Override // defpackage.ejm
    public drq b() {
        throw null;
    }

    @Override // defpackage.ejm
    public final eex c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ejm
    public final Object d(String str) {
        Map map = this.a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // defpackage.ejm
    public String e() {
        throw null;
    }

    @Override // defpackage.ejm
    public final boolean g() {
        Map map = this.a;
        if (map == null || !map.containsKey("is_full_span")) {
            return false;
        }
        return ((Boolean) map.get("is_full_span")).booleanValue();
    }

    @Override // defpackage.ejm
    public final boolean h() {
        Map map = this.a;
        if (map == null || !map.containsKey("is_sticky")) {
            return false;
        }
        return ((Boolean) map.get("is_sticky")).booleanValue();
    }

    @Override // defpackage.ejm
    public ohv i() {
        throw null;
    }

    @Override // defpackage.ejm
    public final void j(Object obj) {
        if (this.b == null) {
            this.b = DesugarCollections.synchronizedMap(new HashMap());
        }
        this.b.put("section_global_key", obj);
    }

    @Override // defpackage.ejm
    public void k() {
        throw null;
    }

    @Override // defpackage.ejm
    public void l() {
        throw null;
    }

    @Override // defpackage.ejm
    public final void f() {
    }

    @Override // defpackage.ejm
    public final void m() {
    }
}
