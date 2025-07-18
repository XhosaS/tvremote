package defpackage;

import com.google.android.libraries.elements.interfaces.DataSourceDelegate;
import com.google.android.libraries.elements.interfaces.DataSourceListener;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mqq extends nzu {
    public final DataSourceDelegate a;
    public final boolean b;
    public final ogq c;
    private final mqs d;
    private final int e;
    private final ogq f;
    private final ogq g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int l;
    private final Integer m;
    private final Float n;

    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, niw] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, niw] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, niw] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, niw] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, niw] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, niw] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, niw] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, niw] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, niw] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, nls] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, nls] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, nls] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, nhq] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, nhq] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, nhq] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object, nhq] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, nlq] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object, nlq] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, nlq] */
    public mqq(ogr ogrVar, oal oalVar, DataSourceDelegate dataSourceDelegate, mqs mqsVar, yqt yqtVar, yqt yqtVar2, yqt yqtVar3, yqt yqtVar4) {
        this.a = dataSourceDelegate;
        this.d = mqsVar;
        this.e = yqtVar.g() ? yqtVar.c().g() : -1;
        Float fValueOf = null;
        this.g = (yqtVar.g() && yqtVar.c().i()) ? ogrVar.o(yqtVar.c().h(), oalVar) : null;
        this.b = yqtVar2.g() && yqtVar2.c().i() && yqtVar2.c().h();
        this.c = (yqtVar2.g() && yqtVar2.c().j()) ? ogrVar.o(yqtVar2.c().g(), oalVar) : null;
        this.h = yqtVar3.g() && yqtVar3.c().h();
        this.f = (yqtVar3.g() && yqtVar3.c().i()) ? ogrVar.o(yqtVar3.c().g(), oalVar) : null;
        this.i = yqtVar4.g() && yqtVar4.c().j();
        this.j = yqtVar4.g() && yqtVar4.c().l();
        int i = 10;
        if (yqtVar4.g() && yqtVar4.c().o()) {
            i = yqtVar4.c().i();
        }
        this.l = i;
        this.m = (yqtVar4.g() && yqtVar4.c().m()) ? Integer.valueOf(yqtVar4.c().h()) : null;
        if (yqtVar4.g() && yqtVar4.c().n()) {
            fValueOf = Float.valueOf(yqtVar4.c().g());
        }
        this.n = fValueOf;
        this.k = yqtVar4.g() && yqtVar4.c().k();
    }

    @Override // defpackage.nzu
    public final int a() {
        return this.l;
    }

    @Override // defpackage.nzu
    public final int b() {
        return this.e;
    }

    @Override // defpackage.nzu
    public final CommandOuterClass$Command c() {
        ogq ogqVar = this.g;
        if (ogqVar != null) {
            return ogqVar.a();
        }
        return null;
    }

    @Override // defpackage.nzu
    public final CommandOuterClass$Command d() {
        ogq ogqVar = this.f;
        if (ogqVar != null) {
            return ogqVar.a();
        }
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final void dispose() {
        this.d.b();
        this.a.dispose();
    }

    @Override // defpackage.nzu
    public final Float e() {
        return this.n;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    @Deprecated
    public final StatusOr elementAtIndex(int i) {
        throw new UnsupportedOperationException("Use elementBytesByKey instead.");
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final StatusOr elementBytesAtIndex(int i) {
        throw new UnsupportedOperationException("Use elementBytesByKey instead.");
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final StatusOr elementBytesByKey(String str) {
        return this.a.elementBytesByKey(str);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.nzu
    public final Integer g() {
        return this.m;
    }

    @Override // defpackage.nzu
    public final void h(DataSourceListener dataSourceListener) {
        this.d.a(dataSourceListener);
    }

    @Override // defpackage.nzu
    public final boolean i() {
        return this.i;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final ArrayList identifiers() {
        return this.a.identifiers();
    }

    @Override // defpackage.nzu
    public final boolean j() {
        return this.k;
    }

    @Override // defpackage.nzu
    public final boolean k() {
        return this.b;
    }

    @Override // defpackage.nzu
    public final boolean l() {
        return this.j;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final Status loadMore() {
        return this.a.loadMore();
    }

    @Override // defpackage.nzu
    public final boolean m() {
        return this.h;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final Status moveItem(int i, int i2) {
        return this.a.moveItem(i, i2);
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final Status reload() {
        return this.a.reload();
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final Status removeItem(int i) {
        return this.a.removeItem(i);
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
    public final int size() {
        return this.a.size();
    }
}
