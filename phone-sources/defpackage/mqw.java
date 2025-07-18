package defpackage;

import android.content.ComponentCallbacks2;
import android.view.View;
import android.widget.RadioGroup;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mqw implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mqw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, nbk] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 0;
        switch (this.b) {
            case 0:
                ((bv) this.a).getActivity().finish();
                break;
            case 1:
                Object obj = this.a;
                try {
                    ((mqh) ((bv) obj).requireActivity()).d(((mqi) obj).a);
                    break;
                } catch (ClassCastException unused) {
                    krd.c(String.format("%s hosting %s does not implement required interface %s.", ((bv) obj).requireActivity().getClass().getSimpleName(), obj.getClass().getSimpleName(), "mqh"));
                    return;
                }
            case 2:
                ((mrd) this.a).a.currentPlayerErrorRepository.c(ieg.a);
                break;
            case 3:
                ((mrd) this.a).a.getActivity().getSupportFragmentManager().M();
                break;
            case 4:
                Object obj2 = this.a;
                kff.s(((bv) obj2).getView(), new mux(((mut) obj2).a.a));
                ((bl) obj2).dismiss();
                break;
            case 5:
                Object obj3 = this.a;
                kff.s(((sfg) obj3).getRootView(), new muy());
                ((bl) obj3).dismiss();
                break;
            case 6:
                Object obj4 = this.a;
                kff.s(view, new muz(((muv) obj4).a.a));
                ((bl) obj4).dismiss();
                break;
            case 7:
                Object obj5 = this.a;
                kff.s(view, new mva(((muv) obj5).a.a));
                ((bl) obj5).dismiss();
                break;
            case 8:
                ((bl) this.a).dismiss();
                break;
            case 9:
                HashMap map = new HashMap();
                Object obj6 = this.a;
                mvk mvkVar = (mvk) obj6;
                ArrayList arrayList = mvkVar.a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mvl mvlVar = (mvl) arrayList.get(i2);
                    map.put(mvlVar.a, mvlVar.d);
                }
                while (true) {
                    List list = mvkVar.d;
                    if (i >= list.size()) {
                        kff.t(((bv) obj6).getView(), mvkVar.b, new mvn(map, mvkVar.c));
                        mvj mvjVar = mvkVar.e;
                        if (mvjVar != null) {
                            mvjVar.a(map);
                        }
                        ((bl) obj6).dismiss();
                        break;
                    } else {
                        mvl mvlVar2 = (mvl) mvkVar.a.get(i);
                        RadioGroup radioGroup = (RadioGroup) ((View) list.get(i)).findViewById(R.id.radio_group);
                        map.put(mvlVar2.a, mvlVar2.a(radioGroup.indexOfChild(radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()))));
                        i++;
                    }
                }
            case 10:
                ((bl) this.a).dismiss();
                break;
            case 11:
                Object obj7 = this.a;
                mwj mwjVar = (mwj) obj7;
                ComponentCallbacks2 componentCallbacks2 = mwjVar.a;
                if (componentCallbacks2 == null) {
                    krd.c(String.format("%s is not attached to any activity.", obj7.getClass().getSimpleName()));
                    break;
                } else {
                    try {
                        ((mwi) componentCallbacks2).s(((mwj) obj7).b);
                        break;
                    } catch (ClassCastException unused2) {
                        krd.c(String.format("%s hosting %s does not implement required interface %s.", mwjVar.a.getClass().getSimpleName(), obj7.getClass().getSimpleName(), "mwi"));
                        return;
                    }
                }
            case 12:
                Object obj8 = this.a;
                kff.s(view, new myf(((myi) obj8).a));
                ((bl) obj8).dismiss();
                break;
            case 13:
                ((bl) this.a).dismiss();
                break;
            case 14:
                Object obj9 = this.a;
                kff.s(view, new myf(((myl) obj9).a));
                ((bl) obj9).dismiss();
                break;
            case 15:
                Object obj10 = this.a;
                kff.s(((bv) obj10).getView(), new myt());
                ((bl) obj10).dismiss();
                break;
            case 16:
                mzl mzlVar = (mzl) this.a;
                tst tstVar = mzlVar.d;
                if (tstVar.g()) {
                    ((pjx) tstVar.c()).a(pjw.b(), view);
                }
                new jyr(new mzj(mzlVar), 20).onClick(view);
                break;
            case 17:
                kff.s(view, new nbc(((nbd) this.a).g));
                break;
            case 18:
                kff.s(view, this.a.c());
                break;
            case 19:
                ((phk) this.a).e = true;
                break;
            default:
                Object obj11 = this.a;
                ((phk) obj11).d = false;
                ((phk) obj11).i.i(((phk) obj11).f, uxd.POSITIVE_RESPONSE);
                break;
        }
    }

    public mqw(mra mraVar, int i) {
        this.b = i;
        this.a = mraVar;
    }
}
