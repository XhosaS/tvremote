package defpackage;

import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mip implements icv, idf {
    private final tpi a;

    public mip(Map map) {
        this.a = new tpi(map);
    }

    private final mgs e(Object obj) {
        Class<?> cls = obj.getClass();
        cls.getClass();
        Object objA = this.a.a(cls);
        if (objA == tpi.a) {
            objA = null;
        }
        mgs mgsVar = (mgs) objA;
        if (mgsVar != null) {
            return mgsVar;
        }
        throw new UnsupportedOperationException("Failed to get view binder for ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return Integer.valueOf(c(obj));
    }

    public final int c(Object obj) {
        return e(obj).a;
    }

    @Override // defpackage.icv
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(Object obj, View view) {
        e(obj).a(obj, view);
    }
}
