package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$IntersectionObserverConfig;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mrk extends mrm {
    public final oaa a;
    public ogq b;
    public boolean c;
    private final ArrayList f;
    private ogq g;
    private ogq h;
    private IntersectionCriteria i;
    private IntersectionCriteria j;
    private long k;
    private boolean l;
    private aggi m;

    public mrk(nkm nkmVar, oaa oaaVar, nzx nzxVar, ogr ogrVar) {
        super(nzxVar);
        this.a = oaaVar;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        if (nkmVar.m()) {
            IntersectionCriteria intersectionCriteriaN = ogr.n(nkmVar.k());
            this.i = intersectionCriteriaN;
            arrayList.add(intersectionCriteriaN);
        }
        if (nkmVar.n()) {
            IntersectionCriteria intersectionCriteriaN2 = ogr.n(nkmVar.l());
            this.j = intersectionCriteriaN2;
            arrayList.add(intersectionCriteriaN2);
        }
        if (this.i == null || this.j == null) {
            arrayList.clear();
            return;
        }
        oal oalVar = ((nyv) this.d).h;
        if (nkmVar.q()) {
            this.g = ogrVar.o(nkmVar.j(), oalVar);
        }
        if (nkmVar.o()) {
            this.h = ogrVar.o(nkmVar.h(), oalVar);
        }
        if (nkmVar.p()) {
            this.b = ogrVar.o(nkmVar.i(), oalVar);
        }
        this.k = Math.max(nkmVar.g(), 0);
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final Status criteriaMatched(ArrayList arrayList) {
        ogq ogqVar;
        if (arrayList.isEmpty()) {
            return Status.d;
        }
        final nzx nzxVarA = a();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            IntersectionCriteria intersectionCriteria = (IntersectionCriteria) arrayList.get(i);
            if (yqs.a(intersectionCriteria, this.i)) {
                if (!this.l) {
                    this.l = true;
                    ogq ogqVar2 = this.g;
                    if (ogqVar2 != null) {
                        agff agffVarA = this.a.a(ogqVar2.a(), nzxVarA);
                        agfx agfxVar = agoq.c;
                        aggz aggzVar = agoh.i;
                        agffVarA.i(agfxVar).k();
                    }
                    if (this.b != null) {
                        long j = this.k;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        agfx agfxVar2 = agoq.b;
                        aggz aggzVar2 = agoh.g;
                        aghn.b(timeUnit, "unit is null");
                        aghn.b(agfxVar2, "scheduler is null");
                        aglq aglqVar = new aglq(Math.max(j, 0L), timeUnit, agfxVar2);
                        aggz aggzVar3 = agoh.k;
                        aggi aggiVarL = aglqVar.l(new aggy() { // from class: mrj
                            @Override // defpackage.aggy
                            public final void a(Object obj) {
                                mrk mrkVar = this.a;
                                ogq ogqVar3 = mrkVar.b;
                                if (ogqVar3 != null) {
                                    mrkVar.a.a(ogqVar3.a(), nzxVarA).k();
                                    mrkVar.c = true;
                                }
                            }
                        });
                        this.m = aggiVarL;
                        aghb aghbVar = ((nyx) ((nyv) this.d).h).f;
                        if (aghbVar != null) {
                            aghbVar.a(aggiVarL);
                        }
                    }
                }
            } else if (yqs.a(intersectionCriteria, this.j)) {
                Object obj = this.m;
                if (obj != null) {
                    aghd.e((AtomicReference) obj);
                }
                if (this.l && !this.c && (ogqVar = this.h) != null) {
                    this.a.a(ogqVar.a(), nzxVarA).k();
                }
                this.l = false;
                this.c = false;
            }
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final ArrayList getCriteriaList() {
        return this.f;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final IntersectionPropertiesOuterClass$IntersectionObserverConfig getCustomConfig() {
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final String getGroupId() {
        return "";
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
