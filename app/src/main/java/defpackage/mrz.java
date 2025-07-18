package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$IntersectionObserverConfig;
import io.grpc.Status;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mrz extends mrm {
    private final ArrayList a;
    private final oaa b;
    private ogq c;
    private ogq f;
    private IntersectionCriteria g;
    private IntersectionCriteria h;
    private final String i;
    private boolean j;

    public mrz(nky nkyVar, oaa oaaVar, nzx nzxVar, ogr ogrVar) {
        super(nzxVar);
        this.b = oaaVar;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (nkyVar.n() && nkyVar.l()) {
            IntersectionCriteria intersectionCriteriaN = ogr.n(nkyVar.i());
            this.g = intersectionCriteriaN;
            arrayList.add(intersectionCriteriaN);
            this.c = ogrVar.o(nkyVar.g(), ((nyv) this.d).h);
        }
        if (nkyVar.o() && nkyVar.m()) {
            IntersectionCriteria intersectionCriteriaN2 = ogr.n(nkyVar.j());
            this.h = intersectionCriteriaN2;
            arrayList.add(intersectionCriteriaN2);
            this.f = ogrVar.o(nkyVar.h(), ((nyv) this.d).h);
        }
        this.i = yqv.b(nkyVar.k());
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final Status criteriaMatched(ArrayList arrayList) {
        ogq ogqVar;
        if (arrayList.isEmpty()) {
            return Status.d;
        }
        nzx nzxVarA = a();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            IntersectionCriteria intersectionCriteria = (IntersectionCriteria) arrayList.get(i);
            if (yqs.a(intersectionCriteria, this.g)) {
                if (!this.j) {
                    this.j = true;
                    ogq ogqVar2 = this.c;
                    if (ogqVar2 != null) {
                        this.b.a(ogqVar2.a(), nzxVarA).k();
                    }
                }
            } else if (yqs.a(intersectionCriteria, this.h)) {
                if (this.j && (ogqVar = this.f) != null) {
                    this.b.a(ogqVar.a(), nzxVarA).k();
                }
                this.j = false;
            }
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final ArrayList getCriteriaList() {
        return this.a;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final IntersectionPropertiesOuterClass$IntersectionObserverConfig getCustomConfig() {
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final String getGroupId() {
        return this.i;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final boolean needContinuousUpdate() {
        return false;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final Status visibilityChanged(float f, Rect rect, Rect rect2) {
        return Status.OK;
    }
}
