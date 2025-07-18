package defpackage;

import android.view.View;
import android.widget.Toast;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class req implements dvw {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ req(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dvw
    public final void dV(Object obj) {
        switch (this.b) {
            case 0:
                View.OnClickListener onClickListener = (View.OnClickListener) ((tst) obj).f();
                rer rerVar = (rer) this.a;
                rerVar.x = onClickListener;
                rerVar.h(rerVar.y, rerVar.x);
                break;
            case 1:
                ((rer) this.a).w.setVisibility(true == ((Boolean) obj).booleanValue() ? 0 : 8);
                break;
            case 2:
                rei reiVar = (rei) obj;
                rer rerVar2 = (rer) this.a;
                rer.l(rerVar2.m, reiVar);
                if (rerVar2.z) {
                    rer.l(rerVar2.n, reiVar);
                    break;
                }
                break;
            case 3:
                tst tstVar = (tst) obj;
                rer rerVar3 = (rer) this.a;
                rerVar3.o.setVisibility(true == tstVar.g() ? 0 : 8);
                if (tstVar.g()) {
                    rerVar3.o.setText((CharSequence) tstVar.c());
                    break;
                }
                break;
            case 4:
                ImmutableList immutableList = (ImmutableList) obj;
                rer rerVar4 = (rer) this.a;
                rerVar4.p.setVisibility(true != immutableList.isEmpty() ? 0 : 8);
                rerVar4.j.b.j(immutableList);
                rerVar4.i();
                break;
            case 5:
                ((tst) obj).getClass();
                sjl.e(new qxp(this.a, 4));
                break;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                rfu rfuVar = (rfu) this.a;
                rfuVar.b = zBooleanValue;
                rfuVar.a(rfuVar.c);
                break;
            case 7:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue2 = bool.booleanValue();
                rfh rfhVar = (rfh) this.a;
                rfhVar.m = zBooleanValue2;
                rfhVar.a(rfhVar.i, rfhVar.l, rfhVar.h, bool.booleanValue());
                break;
            case 8:
                sjl.e(new qxp(this.a, 6));
                break;
            case 9:
                rrx.ac(new qxp(this.a, 11));
                break;
            case 10:
                usi usiVar = (usi) obj;
                int i = usiVar.c - 1;
                Object obj2 = this.a;
                if (i != 0) {
                    ((tvk) ((tvk) ((tvk) usm.a.f()).i(usiVar.b)).j("com/google/frameworks/client/data/android/debug/HostnameOverrideFragment", "updateUi", 70, "HostnameOverrideFragment.java")).s("Could not fetch services");
                    Toast.makeText(((bv) obj2).getContext(), "Could not fetch services", 1).show();
                    break;
                } else {
                    usk uskVar = ((usm) obj2).b;
                    ImmutableList immutableList2 = usiVar.a;
                    ImmutableMultimap.Builder builder = ImmutableMultimap.builder();
                    UnmodifiableIterator it = immutableList2.iterator();
                    while (it.hasNext()) {
                        usq usqVar = (usq) it.next();
                        builder.put(usqVar.a.a, usqVar);
                    }
                    ImmutableList.Builder builder2 = ImmutableList.builder();
                    UnmodifiableIterator it2 = builder.build().asMap().entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        ArrayList arrayList = new ArrayList();
                        String str = null;
                        boolean z = false;
                        String str2 = null;
                        for (usq usqVar2 : (Collection) entry.getValue()) {
                            arrayList.add(usqVar2.a);
                            String str3 = usqVar2.b;
                            if (str2 == null) {
                                str2 = str3 != null ? str3 : (String) Iterables.getLast((Iterable) entry.getKey());
                            } else if (!str2.equals(str3)) {
                                z = true;
                            }
                        }
                        List list = (List) entry.getKey();
                        if (true != z) {
                            str = str2;
                        }
                        builder2.add((ImmutableList.Builder) new aafi(list, str, arrayList));
                    }
                    uskVar.b = builder2.build();
                    uskVar.notifyDataSetChanged();
                    break;
                }
            default:
                usi usiVar2 = (usi) obj;
                int i2 = usiVar2.c - 1;
                Object obj3 = this.a;
                if (i2 != 0) {
                    ((tvk) ((tvk) ((tvk) usv.a.f()).i(usiVar2.b)).j("com/google/frameworks/client/data/android/debug/ServiceOverrideFragment", "updateUi", 60, "ServiceOverrideFragment.java")).s("Could not fetch services");
                    Toast.makeText(((bv) obj3).getContext(), "Could not fetch services", 1).show();
                    break;
                } else {
                    uss ussVar = ((usv) obj3).b;
                    ussVar.b = usiVar2.a;
                    ussVar.notifyDataSetChanged();
                    break;
                }
        }
    }
}
