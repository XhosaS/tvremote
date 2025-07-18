package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.google.android.katniss.R;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class msw implements oec {
    private final aehf a;
    private final aehf b;
    private final aehf c;

    public msw(aehf aehfVar, aehf aehfVar2, aehf aehfVar3) {
        this.a = aehfVar;
        this.b = aehfVar2;
        this.c = aehfVar3;
    }

    @Override // defpackage.oec
    public final mii a() {
        return nfy.F;
    }

    @Override // defpackage.oee
    public final /* bridge */ /* synthetic */ void b(dru druVar, final oal oalVar, String str, Object obj, obz obzVar, nzw nzwVar) {
        final nfy nfyVar = (nfy) obj;
        if (nfyVar.k() == 2) {
            obzVar.z(new obv() { // from class: msu
                @Override // defpackage.obv
                public final void a(View view, ofs ofsVar) {
                    this.a.e(view, nfyVar, oalVar);
                }
            });
        } else if (nfyVar.k() == 3) {
            obzVar.r(new obp() { // from class: msv
                @Override // defpackage.obp
                public final boolean a(View view, ofs ofsVar) {
                    this.a.e(view, nfyVar, oalVar);
                    return true;
                }
            });
        }
    }

    @Override // defpackage.oee
    public final /* synthetic */ void c(dru druVar, oal oalVar, String str, niv nivVar, Object obj, obz obzVar, nzw nzwVar) {
        b(druVar, oalVar, str, obj, obzVar, nzwVar);
    }

    public final void d(ngp ngpVar, acvo acvoVar, oal oalVar) {
        nzv nzvVarP = nzx.p();
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.a;
        acyk acykVar = new acyk();
        acykVar.f(acvo.b, acvoVar);
        ((nyu) nzvVarP).c = (SenderStateOuterClass$SenderState) acykVar.v();
        aggi aggiVarK = ((oaa) this.a.a()).a(((ogr) this.c.a()).o(ngpVar, oalVar).a(), nzvVarP.e()).j((agfx) this.b.a()).k();
        aghb aghbVar = ((nyx) oalVar).f;
        if (aghbVar != null) {
            aghbVar.a(aggiVarK);
        }
    }

    final void e(View view, final nfy nfyVar, final oal oalVar) {
        RecyclerView recyclerView;
        if (view != null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    recyclerView = null;
                    break;
                } else {
                    if (parent instanceof RecyclerView) {
                        recyclerView = (RecyclerView) parent;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
            if (recyclerView != null) {
                Object tag = recyclerView.getTag(R.id.elements_item_touch_helper);
                if (tag instanceof sz) {
                    sz szVar = (sz) tag;
                    qv qvVarFb = recyclerView.fb(view);
                    if (qvVarFb != null) {
                        if (nfyVar.i()) {
                            qvVarFb.a.setTag(R.id.elements_item_drag_started_sender_state_consumer, new Consumer() { // from class: mss
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    oal oalVar2 = oalVar;
                                    this.a.d(nfyVar.g(), (acvo) obj, oalVar2);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        } else {
                            qvVarFb.a.setTag(R.id.elements_item_drag_started_sender_state_consumer, null);
                        }
                        if (nfyVar.j()) {
                            qvVarFb.a.setTag(R.id.elements_item_dropped_sender_state_consumer, new Consumer() { // from class: mst
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    oal oalVar2 = oalVar;
                                    this.a.d(nfyVar.h(), (acvo) obj, oalVar2);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        } else {
                            qvVarFb.a.setTag(R.id.elements_item_dropped_sender_state_consumer, null);
                        }
                        if (!szVar.l.h(szVar.p)) {
                            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
                            return;
                        }
                        if (qvVarFb.a.getParent() != szVar.p) {
                            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                            return;
                        }
                        szVar.h();
                        szVar.h = 0.0f;
                        szVar.g = 0.0f;
                        szVar.m(qvVarFb, 2);
                    }
                }
            }
        }
    }
}
