package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.libraries.material.featurehighlight.TextContentView;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class phn implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ phn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, qvh] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, rjg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qth] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                View.OnClickListener onClickListener = ((pho) this.a).b.m;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 1:
                ((pho) this.a).a();
                break;
            case 2:
                ((TextContentView) this.a).d.bE(3);
                break;
            case 3:
                qwn qwnVar = (qwn) this.a;
                qwnVar.d.c.a(view, qwnVar.b.a());
                break;
            case 4:
                ((raz) this.a).performClick();
                break;
            case 5:
                ((rgf) this.a).performClick();
                break;
            case 6:
                ((rgf) this.a).c.performClick();
                break;
            case 7:
                ntp ntpVar = new ntp(5);
                tae taeVar = (tae) this.a;
                taeVar.d.f(ntpVar, view);
                Object objA = ((qwo) taeVar.h).a();
                ?? r2 = taeVar.b;
                a.ab(cb.A(objA, r2));
                vtw vtwVarM = uzl.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                Object obj = taeVar.e;
                uzl uzlVar = (uzl) vtwVarM.b;
                uzlVar.b = 1 | uzlVar.b;
                uzlVar.c = 218;
                vtwVarM.au();
                qvg.b(view, r2.d(objA), (uzl) vtwVarM.r(), (tst) ((cb) obj).a);
                break;
            case 8:
                rhp rhpVar = (rhp) this.a;
                rhpVar.i.f(new ntp(5), view);
                rhpVar.a(!rhpVar.h);
                break;
            case 9:
                rhp rhpVar2 = (rhp) this.a;
                rfn rfnVar = (rfn) rhpVar2.k.c();
                rhpVar2.getContext();
                rfnVar.a();
                break;
            case 10:
                this.a.a();
                AddAccountActivity.startActivity(view);
                break;
            case 11:
                Object obj2 = this.a;
                rlz rlzVar = ((rme) obj2).h;
                if (rlzVar != null) {
                    rlzVar.d.f(new ntp(5), view);
                }
                ((bl) obj2).dismiss();
                break;
            case 12:
                ((seq) this.a).b.b(sfb.a, (RecyclerView) view.getParent());
                break;
            case 13:
                ((CheckBox) this.a).toggle();
                break;
            case 14:
                ((sfs) this.a).cancel();
                break;
            case 15:
                sfs sfsVar = (sfs) this.a;
                if (sfsVar.c && sfsVar.isShowing()) {
                    if (!sfsVar.e) {
                        TypedArray typedArrayObtainStyledAttributes = sfsVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        sfsVar.d = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        sfsVar.e = true;
                    }
                    if (sfsVar.d) {
                        sfsVar.cancel();
                        break;
                    }
                }
                break;
            case 16:
                sqg sqgVar = (sqg) this.a;
                if (sqgVar.e && sqgVar.isShowing()) {
                    if (!sqgVar.g) {
                        TypedArray typedArrayObtainStyledAttributes2 = sqgVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        sqgVar.f = typedArrayObtainStyledAttributes2.getBoolean(0, true);
                        typedArrayObtainStyledAttributes2.recycle();
                        sqgVar.g = true;
                    }
                    if (sqgVar.f) {
                        sqgVar.cancel();
                        break;
                    }
                }
                break;
            case 17:
                sqq sqqVar = (sqq) this.a;
                sqqVar.f();
                sqqVar.d.show();
                break;
            case 18:
                MenuItemImpl menuItemImpl = ((svw) view).h;
                swa swaVar = (swa) this.a;
                boolean zC = swaVar.H.a.C(menuItemImpl, swaVar.G, 0);
                if (menuItemImpl != null && menuItemImpl.isCheckable()) {
                    if (!zC || menuItemImpl.isChecked()) {
                        swaVar.f(menuItemImpl);
                        break;
                    }
                }
                break;
            case 19:
                sys sysVar = (sys) this.a;
                sysVar.k.setText("");
                sysVar.g();
                break;
            default:
                ((sys) this.a).n();
                break;
        }
    }

    public phn(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
