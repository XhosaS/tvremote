package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.Html;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcd {
    public static final tvn a = tvn.n("GnpSdk");
    public final Context b;
    public final qcg c;
    public final xbw d;
    public final qbp e;
    public final pvg f;
    public final qej g;
    private final pvx h;
    private final yfo i;

    public qcd(Context context, qei qeiVar, pvx pvxVar, qcg qcgVar, xbw xbwVar, qbp qbpVar, pvg pvgVar, yfo yfoVar) {
        this.b = context;
        this.h = pvxVar;
        this.c = qcgVar;
        this.d = xbwVar;
        this.e = qbpVar;
        this.f = pvgVar;
        this.g = qeiVar.c;
        this.i = yfoVar;
    }

    public static CharSequence c(String str) {
        return xdw.a.get().b() ? Html.fromHtml(str, 63) : str;
    }

    public static List e(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uhp uhpVar = (uhp) it.next();
            if (uhpVar.isDone()) {
                try {
                    Bitmap bitmap = (Bitmap) sfy.J(uhpVar);
                    if (bitmap != null) {
                        arrayList.add(bitmap);
                    }
                } catch (CancellationException | ExecutionException e) {
                    ((tvk) ((tvk) ((tvk) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "tryGettingBitmapsFromFutureList", (char) 1168, "NotificationBuilderHelper.java")).s("Failed to download image.");
                }
            }
        }
        return arrayList;
    }

    public static boolean f(qis qisVar, qdo qdoVar, List list, List list2, List list3) {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll((Iterable) list);
        builder.addAll((Iterable) list2);
        builder.addAll((Iterable) list3);
        uhp uhpVarH = sfy.H(builder.build());
        if (qdoVar.e()) {
            ((tvk) ((tvk) a.e()).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "loadBitmapsWithTimeoutBlocking", 1112, "NotificationBuilderHelper.java")).v("Downloading images for notification without timeout with thread ID %s", qisVar.a);
            try {
                ((ufb) uhpVarH).s();
            } catch (InterruptedException e) {
                ((tvk) ((tvk) ((tvk) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "loadBitmapsWithTimeoutBlocking", 1121, "NotificationBuilderHelper.java")).v("Failed to download images for notification with thread ID %s", qisVar.a);
                Thread.currentThread().interrupt();
            } catch (CancellationException e2) {
                e = e2;
                ((tvk) ((tvk) ((tvk) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "loadBitmapsWithTimeoutBlocking", 1118, "NotificationBuilderHelper.java")).v("Failed to download images for notification with thread ID %s", qisVar.a);
            } catch (ExecutionException e3) {
                e = e3;
                ((tvk) ((tvk) ((tvk) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "loadBitmapsWithTimeoutBlocking", 1118, "NotificationBuilderHelper.java")).v("Failed to download images for notification with thread ID %s", qisVar.a);
            }
        } else {
            long jA = qdoVar.a();
            ((tvk) ((tvk) a.e()).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "loadBitmapsWithTimeoutBlocking", 1128, "NotificationBuilderHelper.java")).A("Downloading images for notification with thread ID %s, timeout: %d ms", qisVar.a, jA);
            try {
                ((ufb) uhpVarH).t(jA, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e4) {
                ((tvk) ((tvk) ((tvk) a.g()).i(e4)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "loadBitmapsWithTimeoutBlocking", 1146, "NotificationBuilderHelper.java")).A("Failed to download images for notification with thread ID %s, remaining time: %d ms.", qisVar.a, qdoVar.a());
                Thread.currentThread().interrupt();
                return false;
            } catch (CancellationException e5) {
                e = e5;
                ((tvk) ((tvk) ((tvk) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "loadBitmapsWithTimeoutBlocking", 1135, "NotificationBuilderHelper.java")).A("Failed to download images for notification with thread ID %s, remaining time: %d ms.", qisVar.a, qdoVar.a());
                return false;
            } catch (ExecutionException e6) {
                e = e6;
                ((tvk) ((tvk) ((tvk) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "loadBitmapsWithTimeoutBlocking", 1135, "NotificationBuilderHelper.java")).A("Failed to download images for notification with thread ID %s, remaining time: %d ms.", qisVar.a, qdoVar.a());
                return false;
            } catch (TimeoutException e7) {
                ((tvk) ((tvk) ((tvk) a.g()).i(e7)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "loadBitmapsWithTimeoutBlocking", 1140, "NotificationBuilderHelper.java")).A("Timed out while downloading images for notification with thread ID %s, remaining time: %d ms.", qisVar.a, qdoVar.a());
                return true;
            }
        }
        return false;
    }

    public static final boolean g(qen qenVar) {
        return qenVar != null && (qenVar.b() instanceof qpz);
    }

    public static final boolean h(vld vldVar) {
        return xfx.a.get().b() || vldVar.y;
    }

    public static int i(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return -1;
        }
        if (i2 != 3) {
            return i2 != 4 ? 0 : -2;
        }
        return 2;
    }

    public final Bitmap a(vld vldVar, List list) throws Resources.NotFoundException {
        if (list.isEmpty()) {
            return null;
        }
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.notifications_icon_size);
        int iBm = a.bm(vldVar.s);
        if (iBm == 0) {
            iBm = 1;
        }
        return iBm + (-1) != 2 ? this.h.a(dimensionPixelSize, list) : this.h.b(dimensionPixelSize, list);
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, uhp] */
    public final uhp b(qen qenVar, String str, String str2, final int i, final int i2, boolean z) {
        final String str3 = qenVar == null ? null : qenVar.b;
        final String str4 = true == str2.isEmpty() ? str : str2;
        ttm ttmVar = new ttm() { // from class: qcc
            @Override // defpackage.ttm
            public final Object get() {
                return ((qpm) this.a.d.b()).a(str3, str4, i, i2);
            }
        };
        ?? r7 = ttmVar.get();
        return !z ? r7 : ues.j(r7, Throwable.class, new pbb(ttmVar, 11), (Executor) this.i.b());
    }

    public final List d(qen qenVar, List list, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vls vlsVar = (vls) it.next();
            if (!vlsVar.b.isEmpty() || !vlsVar.c.isEmpty()) {
                qen qenVar2 = qenVar;
                int i3 = i;
                int i4 = i2;
                boolean z2 = z;
                arrayList.add(b(qenVar2, vlsVar.b, vlsVar.c, i3, i4, z2));
                if (arrayList.size() >= 4) {
                    break;
                }
                qenVar = qenVar2;
                i = i3;
                i2 = i4;
                z = z2;
            }
        }
        return arrayList;
    }
}
