package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vk extends vr {
    public final HashMap a = new HashMap();

    @Override // defpackage.vr
    public final vn a(Object obj) {
        return (vn) this.a.get(obj);
    }

    @Override // defpackage.vr
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.a.remove(obj);
        return objB;
    }
}
