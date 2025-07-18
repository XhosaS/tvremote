package defpackage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.appcompat.R;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jay {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/notifications/NotificationClickIntentProviderImpl");
    private final Context b;

    public jay(Context context) {
        this.b = context;
    }

    public final qrm a(ptn ptnVar, qen qenVar, ptm ptmVar) throws vuq {
        wpi wpiVar;
        wlb wlbVar;
        String str;
        int iAs;
        vun vunVar;
        Object next;
        vsl vslVar = ptnVar.c;
        if (vslVar != null) {
            try {
                vsz vszVar = vslVar.c;
                vtp vtpVarA = vtp.a();
                wpi wpiVar2 = wpi.a;
                vte vteVarK = vszVar.k();
                vuc vucVarO = wpiVar2.o();
                try {
                    try {
                        vvy vvyVarB = vvs.a.b(vucVarO);
                        vvyVarB.l(vucVarO, vtf.p(vteVarK), vtpVarA);
                        vvyVarB.g(vucVarO);
                        try {
                            vteVarK.z(0);
                            vuc.B(vucVarO);
                            wpiVar = (wpi) vucVarO;
                        } catch (vuq e) {
                            throw e;
                        }
                    } catch (vwf e2) {
                        throw e2.a();
                    } catch (RuntimeException e3) {
                        if (e3.getCause() instanceof vuq) {
                            throw ((vuq) e3.getCause());
                        }
                        throw e3;
                    }
                } catch (vuq e4) {
                    if (e4.a) {
                        throw new vuq(e4);
                    }
                    throw e4;
                } catch (IOException e5) {
                    if (e5.getCause() instanceof vuq) {
                        throw ((vuq) e5.getCause());
                    }
                    throw new vuq(e5);
                }
            } catch (vuq e6) {
                ((tug) a.g().j("com/google/android/apps/googletv/app/notifications/NotificationClickIntentProviderImpl", "toUiNotification", R.styleable.AppCompatTheme_windowFixedHeightMinor, "NotificationClickIntentProviderImpl.kt")).v("Chime UI notification received invalid payload. Caught error %s", e6);
                wpiVar = null;
            }
            if (wpiVar == null || (vunVar = wpiVar.d) == null) {
                wlbVar = null;
            } else {
                Iterator<E> it = vunVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (yks.e(((wlb) next).b, ptmVar != null ? ptmVar.a : null)) {
                        break;
                    }
                }
                wlbVar = (wlb) next;
            }
            if (ptmVar != null && wlbVar == null) {
                ((tug) a.g().j("com/google/android/apps/googletv/app/notifications/NotificationClickIntentProviderImpl", "createClickBehavior", 81, "NotificationClickIntentProviderImpl.kt")).v("No custom action found for action Id: %s", ptmVar.a);
                return new qrm(2, null);
            }
            if (wlbVar == null || (iAs = a.as(wlbVar.d)) == 0 || iAs != 4) {
                String str2 = ptnVar.a;
                Intent intent = new Intent();
                Intent intentPutExtra = intent.setClassName(this.b, "com.google.android.apps.googletv.app.notifications.ChimeNotificationLauncherActivity").putExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 1).putExtra("notification_type", str2);
                if (qenVar == null || (str = qenVar.b) == null) {
                    str = "";
                }
                Intent intentPutExtra2 = intentPutExtra.putExtra("account", str);
                intentPutExtra2.getClass();
                hju.A(intentPutExtra2, "notification_payload", ptnVar.c);
                if (ptmVar != null) {
                    intent.putExtra("action_id", ptmVar.a);
                }
                List listT = yfm.t(intent);
                if (listT.isEmpty()) {
                    throw new IllegalStateException("Must provide at least one activity intent.");
                }
                return new qrm(1, listT);
            }
        }
        return new qrm(2, null);
    }
}
