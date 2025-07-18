package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sca {
    public scq w;
    public View x;
    private final Map a = new LinkedHashMap();
    public final Map v = new LinkedHashMap();
    private final Map b = new LinkedHashMap();

    protected final void finalize() {
        this.a.clear();
        this.v.clear();
    }

    public String g() {
        return "";
    }

    public void l() {
        Map map = this.v;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((scb) it.next()).b();
        }
        map.clear();
    }

    public final Context o() {
        Context context = q().getContext();
        context.getClass();
        return context;
    }

    public final View p(int i) throws scr {
        Map map = this.a;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            Object obj = map.get(numValueOf);
            obj.getClass();
            return (View) obj;
        }
        View viewFindViewById = q().findViewById(i);
        if (viewFindViewById instanceof ViewStub) {
            ViewStub viewStub = (ViewStub) viewFindViewById;
            if (viewStub.getInflatedId() == -1) {
                throw new IllegalArgumentException("ViewStubs must specify inflateId");
            }
            x(i, viewStub.getInflatedId());
            return viewFindViewById;
        }
        if (viewFindViewById == null) {
            Map map2 = this.b;
            if (map2.containsKey(numValueOf)) {
                Integer num = (Integer) map2.get(numValueOf);
                if (num != null) {
                    viewFindViewById = q().findViewById(num.intValue());
                } else {
                    viewFindViewById = null;
                }
            }
        }
        if (viewFindViewById != null) {
            map.put(numValueOf, viewFindViewById);
        }
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new scr(null);
    }

    public final View q() {
        View view = this.x;
        if (view != null) {
            return view;
        }
        yks.c("view");
        return null;
    }

    public final void r(int i, View.OnClickListener onClickListener) {
        p(i).setOnClickListener(onClickListener);
    }

    public final void s(int i, CharSequence charSequence) {
        p(i).setContentDescription(charSequence);
    }

    public final void t(int i, View.OnLongClickListener onLongClickListener) {
        p(i).setOnLongClickListener(onLongClickListener);
    }

    public final void u(int i, scf scfVar) throws scr {
        View viewP = p(i);
        if (scfVar == null) {
            if (!(viewP instanceof ViewStub)) {
                viewP.setVisibility(8);
            }
            Map map = this.v;
            Integer numValueOf = Integer.valueOf(i);
            scb scbVar = (scb) map.get(numValueOf);
            if (scbVar != null) {
                scbVar.b();
            }
            map.remove(numValueOf);
            return;
        }
        Map map2 = this.v;
        Integer numValueOf2 = Integer.valueOf(i);
        Object scqVar = map2.get(numValueOf2);
        if (scqVar == null) {
            scq scqVar2 = this.w;
            scqVar2.getClass();
            viewP.getClass();
            if (viewP instanceof RecyclerView) {
                throw new IllegalArgumentException("getChildBinder cannot be used to get a binder for recyclerview. Use getChildRecyclerViewBinder instead");
            }
            sca scaVar = (sca) viewP.getTag(-2147483647);
            if ((scaVar != null ? scaVar.w : null) != null) {
                scqVar = scaVar.w;
                scqVar.getClass();
            } else {
                scqVar = new scq(scqVar2.b, viewP);
            }
            map2.put(numValueOf2, scqVar);
        }
        ((scb) scqVar).a(scfVar);
        if (viewP instanceof ViewStub) {
            return;
        }
        viewP.setVisibility(0);
    }

    public final void v(int i, List list, int i2) throws scr {
        if (list != null) {
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    yfm.w();
                }
                Object obj2 = (scf) obj;
                scl sclVar = obj2 instanceof scl ? (scl) obj2 : null;
                if (sclVar != null) {
                    sclVar.k(i3);
                }
                i3 = i4;
            }
        }
        View viewP = p(i);
        if (!(viewP instanceof RecyclerView)) {
            Class<?> cls = viewP.getClass();
            Objects.toString(cls);
            throw new IllegalArgumentException("Expected RecyclerView to bind model list. Found ".concat(String.valueOf(cls)));
        }
        if (list == null) {
            ((RecyclerView) viewP).setVisibility(8);
            Map map = this.v;
            Integer numValueOf = Integer.valueOf(i);
            scb scbVar = (scb) map.get(numValueOf);
            if (scbVar != null) {
                scbVar.b();
            }
            map.remove(numValueOf);
            return;
        }
        Map map2 = this.v;
        Integer numValueOf2 = Integer.valueOf(i);
        Object sdaVar = map2.get(numValueOf2);
        if (sdaVar == null) {
            scq scqVar = this.w;
            scqVar.getClass();
            RecyclerView recyclerView = (RecyclerView) viewP;
            Integer numValueOf3 = i2 != 0 ? Integer.valueOf(i2) : null;
            recyclerView.getClass();
            if (recyclerView.getAdapter() == null) {
                sdaVar = new sda(scqVar.b, recyclerView, numValueOf3);
            } else {
                if (!(recyclerView.getAdapter() instanceof sdc)) {
                    int i5 = ylg.a;
                    ykl yklVar = new ykl(sdc.class);
                    yklVar.toString();
                    throw new IllegalArgumentException("RecyclerView adapter is expected to be of type ".concat(yklVar.toString()));
                }
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                adapter.getClass();
                sda sdaVar2 = ((sdc) adapter).a;
                sdaVar = sdaVar2 == null ? new sda(scqVar.b, recyclerView, numValueOf3) : sdaVar2;
            }
            map2.put(numValueOf2, sdaVar);
        }
        ((scb) sdaVar).a(list);
        ((RecyclerView) viewP).setVisibility(0);
    }

    public final void w(int i, CharSequence charSequence, int i2) {
        TextView textView = (TextView) p(i);
        if (charSequence instanceof Spannable) {
            textView.setText(charSequence, TextView.BufferType.SPANNABLE);
        } else {
            textView.setText(charSequence);
        }
        if (i2 != -1) {
            if (charSequence != null && charSequence.length() != 0) {
                i2 = 0;
            }
            textView.setVisibility(i2);
        }
    }

    public final void x(int i, int i2) {
        this.b.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void y(Uri uri) {
        ImageView imageView = (ImageView) p(R.id.thumbnail);
        ((hke) ((hke) hjr.c(imageView.getContext()).e(uri).m()).t(R.drawable.thumbnail_placeholder)).k(imageView);
    }

    public void h() {
    }

    public void z() {
    }
}
