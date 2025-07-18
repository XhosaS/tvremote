package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Trace;
import android.support.v7.widget.ActivityChooserView;
import com.google.android.apps.play.movies.mobile.usecase.settings.InternalSettingsActivity;
import com.google.android.apps.play.movies.mobile.usecase.settings.SettingsActivity;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgx implements idy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public lgx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) {
        byte b;
        llv llvVarD;
        DialogInterface dialogInterface;
        int i = 3;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        switch (this.b) {
            case 0:
                ieg iegVar = (ieg) obj;
                if (iegVar.m()) {
                    ((lgy) this.a).e("LoadLicenceAfterProvisioning");
                    break;
                } else {
                    ((lgy) this.a).f(iegVar.i(), true);
                    break;
                }
            case 1:
                ieg iegVar2 = (ieg) obj;
                if (iegVar2.m()) {
                    ((lgy) this.a).g();
                    break;
                } else {
                    ((lgy) this.a).f(iegVar2.i(), true);
                    break;
                }
            case 2:
                ieg iegVar3 = (ieg) obj;
                if (iegVar3.m()) {
                    lgy lgyVar = (lgy) this.a;
                    lgyVar.e = 4;
                    lgyVar.f = false;
                    break;
                } else {
                    Object obj2 = this.a;
                    Throwable thI = iegVar3.i();
                    lgy lgyVar2 = (lgy) obj2;
                    byte b2 = (lgyVar2.f || lgy.h(thI)) ? false : true;
                    lgyVar2.f = true;
                    if (b2 == false && lgyVar2.e != 4) {
                        z = true;
                    }
                    lgyVar2.f(thI, z);
                    if (b2 != false) {
                        lgyVar2.g.i("OfflineRefreshErrorRetry", lgyVar2.c);
                        break;
                    }
                }
                break;
            case 3:
                ieg iegVar4 = (ieg) obj;
                if (iegVar4.m()) {
                    lgy lgyVar3 = (lgy) this.a;
                    boolean z3 = lgyVar3.a;
                    lhe lheVar = lgyVar3.g;
                    long jA = lheVar.a();
                    if (z3) {
                        if (jA == 0) {
                            lgyVar3.f(new lgu(), true);
                            break;
                        } else {
                            lgyVar3.e = 4;
                            break;
                        }
                    } else if (jA < 60) {
                        if (lgyVar3.d.d()) {
                            lheVar.i(null, lgyVar3.c);
                            break;
                        } else {
                            lgyVar3.f(new lgs(), true);
                            break;
                        }
                    } else {
                        lgyVar3.e = 4;
                        if (jA < 86400) {
                            lheVar.i(null, lgyVar3.c);
                            break;
                        }
                    }
                } else {
                    ((lgy) this.a).f(iegVar4.i(), true);
                    break;
                }
                break;
            case 4:
                ieg iegVar5 = (ieg) obj;
                if (iegVar5.m()) {
                    lgy lgyVar4 = (lgy) this.a;
                    lgyVar4.e = 4;
                    lgyVar4.f = false;
                    break;
                } else {
                    Object obj3 = this.a;
                    Throwable thI2 = iegVar5.i();
                    boolean zH = lgy.h(thI2);
                    boolean zU = kff.u(thI2);
                    lgy lgyVar5 = (lgy) obj3;
                    int i2 = lgyVar5.e;
                    if (i2 == 3) {
                        b = (lgyVar5.f || zH || !zU) ? false : true;
                    } else {
                        b = false;
                        i = i2;
                    }
                    byte b3 = i == 4 && !zH;
                    lgyVar5.f = true;
                    if (b == false && b3 == false) {
                        z2 = true;
                    }
                    lgyVar5.f(thI2, z2);
                    if (b != false) {
                        lgyVar5.g.i("StreamingErrorRetry", lgyVar5.b);
                        break;
                    }
                }
                break;
            case 5:
                ((lmi) this.a).e((eox) obj);
                break;
            case 6:
                lmi lmiVar = (lmi) this.a;
                lmiVar.P = true;
                int i3 = llx.a;
                qti qtiVar = new qti();
                qtiVar.f(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                qtiVar.e(true);
                UnmodifiableIterator it = ((ImmutableList) obj).iterator();
                byte b4 = false;
                int iMin = Integer.MAX_VALUE;
                int iMin2 = Integer.MAX_VALUE;
                while (it.hasNext()) {
                    lrv lrvVar = (lrv) it.next();
                    int i4 = lrvVar.a;
                    int i5 = i4 != 2 ? i4 != 3 ? Integer.MAX_VALUE : 1080 : 719;
                    if (lrvVar.b) {
                        iMin2 = Math.min(i5, iMin2);
                        b4 = true;
                    } else {
                        iMin = Math.min(i5, iMin);
                    }
                }
                if (iMin > iMin2 || !b4 == true) {
                    qtiVar.e(false);
                    qtiVar.f(iMin);
                    llvVarD = qtiVar.d();
                } else {
                    qtiVar.e(true);
                    qtiVar.f(iMin2);
                    llvVarD = qtiVar.d();
                }
                lmiVar.Q = tst.i(llvVarD);
                break;
            case 7:
                xag xagVar = (xag) obj;
                lxk lxkVar = (lxk) this.a;
                Map map = (Map) lxkVar.b.get();
                if (map != null) {
                    for (xax xaxVar : xagVar.c) {
                        xaz xazVar = xaxVar.c;
                        if (xazVar == null) {
                            xazVar = xaz.a;
                        }
                        if (!xazVar.c.isEmpty()) {
                            xaz xazVar2 = xaxVar.c;
                            if (xazVar2 == null) {
                                xazVar2 = xaz.a;
                            }
                            map.put(ksy.b(xazVar2), xaxVar);
                        }
                    }
                    lxkVar.d.eb();
                    break;
                }
                break;
            case 8:
                Throwable th = (Throwable) obj;
                llt lltVar = th instanceof llt ? (llt) th : new llt(0, -1, th, false, false, trk.a);
                mje mjeVar = (mje) this.a;
                mjeVar.a.K(mjeVar.b.b, mjeVar.d, mjeVar.c, mjeVar.e, mjeVar.j, lltVar.c(), lltVar.a(), lltVar.getCause());
                boolean z4 = mjeVar.j;
                mjeVar.q();
                if (z4) {
                    mjeVar.h(4, lltVar);
                    break;
                }
                break;
            case 9:
                mji mjiVar = (mji) obj;
                mje mjeVar2 = (mje) this.a;
                mjeVar2.l = mjiVar;
                String str = mjiVar.f;
                int i6 = mjiVar.a;
                int i7 = mjiVar.h;
                mrn mrnVar = (mrn) mjeVar2.h;
                mrnVar.b.c(str);
                mrnVar.c.c.c(Integer.valueOf(i6));
                mrnVar.a.c(Integer.valueOf(i7));
                if (mjeVar2.i == 1) {
                    Trace.beginSection("finishInit");
                    int iMin3 = Math.min(mjeVar2.b(), i6);
                    mjeVar2.m = iMin3;
                    mjeVar2.k = mjeVar2.g.a(iMin3);
                    mjeVar2.f();
                    mjeVar2.a.J(mjeVar2.b.b, true != (mjeVar2.f instanceof mkr) ? 0 : 4);
                    mjeVar2.i = 2;
                    if (mjeVar2.j) {
                        mjeVar2.o();
                    }
                    Trace.endSection();
                    break;
                }
                break;
            case 10:
                ieg iegVar6 = (ieg) obj;
                if (!iegVar6.l()) {
                    Object obj4 = this.a;
                    InternalSettingsActivity internalSettingsActivity = (InternalSettingsActivity) obj4;
                    internalSettingsActivity.h.c(ieg.a);
                    by byVar = (by) obj4;
                    mgq.a(byVar);
                    if (iegVar6.k()) {
                        Object objB = internalSettingsActivity.g.b(new llt(internalSettingsActivity.l.f(iegVar6.i(), true), -1, iegVar6.i(), false, false, trk.a));
                        cr supportFragmentManager = byVar.getSupportFragmentManager();
                        String str2 = mqe.a;
                        Bundle bundle = new Bundle();
                        bundle.putString("error_message", (String) objB);
                        mqe mqeVar = new mqe();
                        mqeVar.setArguments(bundle);
                        mqeVar.show(supportFragmentManager, mqe.a);
                        break;
                    }
                }
                break;
            case 11:
                SettingsActivity settingsActivity = (SettingsActivity) this.a;
                settingsActivity.c();
                if (((ieg) obj).m()) {
                    settingsActivity.e();
                    break;
                }
                break;
            case 12:
                Boolean bool = (Boolean) obj;
                mqp mqpVar = ((mrg) this.a).j;
                if (mqpVar != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    mqv mqvVar = (mqv) mqpVar;
                    mqvVar.setVisibility(true == zBooleanValue ? 8 : 0);
                    if (zBooleanValue && (dialogInterface = mqvVar.d) != null) {
                        dialogInterface.dismiss();
                        break;
                    }
                }
                break;
            default:
                Integer num = (Integer) obj;
                mrn mrnVar2 = (mrn) this.a;
                mrnVar2.t.a(num.intValue() == 0);
                mrnVar2.p.a(num.intValue() != 0);
                break;
        }
    }
}
