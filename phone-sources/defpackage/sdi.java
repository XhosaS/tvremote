package defpackage;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdi extends scb {
    private final dvk a;
    private final ViewPager b;

    public sdi(dvk dvkVar, ViewPager viewPager) throws Resources.NotFoundException {
        this.a = dvkVar;
        this.b = viewPager;
        if (viewPager.b == null) {
            viewPager.h(new sdj(viewPager));
        }
        gll gllVar = viewPager.b;
        if (!(gllVar instanceof sdj)) {
            Objects.toString(gllVar);
            throw new IllegalArgumentException("ViewPager accepts only ViewPagerBinderAdapter. Found ".concat(String.valueOf(gllVar)));
        }
        gllVar.getClass();
        ((sdj) gllVar).e = this;
    }

    @Override // defpackage.scb
    public final /* bridge */ /* synthetic */ void a(Object obj) throws Resources.NotFoundException {
        sdj sdjVarB = b();
        sdjVarB.d = (List) obj;
        sdjVarB.c.i(sdjVarB.f);
        synchronized (sdjVarB) {
            DataSetObserver dataSetObserver = sdjVarB.b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        sdjVarB.a.notifyChanged();
    }

    public final scq c(View view) {
        sca scaVar = (sca) view.getTag(-2147483647);
        if ((scaVar != null ? scaVar.w : null) == null) {
            return new scq(this.a, view);
        }
        scq scqVar = scaVar.w;
        scqVar.getClass();
        return scqVar;
    }

    @Override // defpackage.scb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final sdj b() {
        gll gllVar = this.b.b;
        gllVar.getClass();
        return (sdj) gllVar;
    }
}
