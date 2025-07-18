package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
class fvk extends fvl implements fvc, fve {
    private static final ArrayList q;
    private static final ArrayList r;
    protected final MediaRouter a;
    protected final MediaRouter.Callback b;
    protected final MediaRouter.VolumeCallback c;
    protected final MediaRouter.RouteCategory d;
    protected int l;
    protected boolean m;
    protected boolean n;
    protected final ArrayList o;
    protected final ArrayList p;
    private final ftw s;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        q = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        r = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public fvk(Context context, ftw ftwVar) {
        super(context);
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.s = ftwVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.a = mediaRouter;
        this.b = new fvd(this);
        this.c = new fvf(this);
        this.d = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        A();
    }

    private final void A() {
        if (this.n) {
            this.a.removeCallback(this.b);
        }
        this.n = true;
        int i = (this.m ? 1 : 0) | 2;
        MediaRouter mediaRouter = this.a;
        mediaRouter.addCallback(this.l, this.b, i);
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean zB = false;
        for (int i2 = 0; i2 < routeCount; i2++) {
            arrayList.add(mediaRouter.getRouteAt(i2));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zB |= B((MediaRouter.RouteInfo) it.next());
        }
        if (zB) {
            v();
        }
    }

    private final boolean B(MediaRouter.RouteInfo routeInfo) {
        String str;
        if (x(routeInfo) != null || o(routeInfo) >= 0) {
            return false;
        }
        String str2 = this.a.getDefaultRoute() == routeInfo ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(r(routeInfo).hashCode()));
        if (p(str2) >= 0) {
            int i = 2;
            while (true) {
                str = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i));
                if (p(str) < 0) {
                    break;
                }
                i++;
            }
            str2 = str;
        }
        ivx ivxVar = new ivx(routeInfo, str2);
        z(ivxVar);
        this.o.add(ivxVar);
        return true;
    }

    protected static final fvj x(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof fvj) {
            return (fvj) tag;
        }
        return null;
    }

    protected static final void y(fvj fvjVar) {
        MediaRouter.UserRouteInfo userRouteInfo = fvjVar.b;
        fux fuxVar = fvjVar.a;
        userRouteInfo.setName(fuxVar.e);
        userRouteInfo.setPlaybackType(fuxVar.k);
        userRouteInfo.setPlaybackStream(fuxVar.l);
        userRouteInfo.setVolume(fuxVar.n);
        userRouteInfo.setVolumeMax(fuxVar.o);
        userRouteInfo.setVolumeHandling(fuxVar.f());
        userRouteInfo.setDescription(fuxVar.f);
    }

    @Override // defpackage.fvc
    public final void a(MediaRouter.RouteInfo routeInfo) {
        if (B(routeInfo)) {
            v();
        }
    }

    @Override // defpackage.fvc
    public final void b(MediaRouter.RouteInfo routeInfo) {
        int iO;
        if (x(routeInfo) != null || (iO = o(routeInfo)) < 0) {
            return;
        }
        z((ivx) this.o.get(iO));
        v();
    }

    @Override // defpackage.fup
    public final fun c(String str) {
        int iP = p(str);
        if (iP >= 0) {
            return new fvi((MediaRouter.RouteInfo) ((ivx) this.o.get(iP)).a);
        }
        return null;
    }

    @Override // defpackage.fvc
    public final void d(MediaRouter.RouteInfo routeInfo) {
        int iO = o(routeInfo);
        if (iO >= 0) {
            ivx ivxVar = (ivx) this.o.get(iO);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != ((fug) ivxVar.c).e()) {
                fuf fufVar = new fuf((fug) ivxVar.c);
                fufVar.j(displayId);
                ivxVar.c = fufVar.a();
                v();
            }
        }
    }

    @Override // defpackage.fup
    public final void e(fuh fuhVar) {
        boolean zB;
        int i = 0;
        if (fuhVar != null) {
            List listB = fuhVar.a().b();
            int size = listB.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) listB.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                i++;
            }
            zB = fuhVar.b();
            i = i2;
        } else {
            zB = false;
        }
        if (this.l == i && this.m == zB) {
            return;
        }
        this.l = i;
        this.m = zB;
        A();
    }

    @Override // defpackage.fvc
    public final void f(MediaRouter.RouteInfo routeInfo) {
        int iO;
        if (x(routeInfo) != null || (iO = o(routeInfo)) < 0) {
            return;
        }
        this.o.remove(iO);
        v();
    }

    @Override // defpackage.fvc
    public final void g(MediaRouter.RouteInfo routeInfo) {
        int iO;
        if (x(routeInfo) != null || (iO = o(routeInfo)) < 0) {
            return;
        }
        ivx ivxVar = (ivx) this.o.get(iO);
        int volume = routeInfo.getVolume();
        if (volume != ((fug) ivxVar.c).f()) {
            fuf fufVar = new fuf((fug) ivxVar.c);
            fufVar.k(volume);
            ivxVar.c = fufVar.a();
            v();
        }
    }

    @Override // defpackage.fvc
    public final void i(MediaRouter.RouteInfo routeInfo) {
        fux fuxVarB;
        if (routeInfo != this.a.getSelectedRoute(8388611)) {
            return;
        }
        fvj fvjVarX = x(routeInfo);
        if (fvjVarX != null) {
            fvjVarX.a.o(false);
            return;
        }
        int iO = o(routeInfo);
        if (iO >= 0) {
            ivx ivxVar = (ivx) this.o.get(iO);
            ftw ftwVar = this.s;
            Object obj = ivxVar.b;
            ftwVar.a.removeMessages(262);
            fuw fuwVarC = ftwVar.c(ftwVar.o);
            if (fuwVarC == null || (fuxVarB = fuwVarC.b((String) obj)) == null) {
                return;
            }
            fuxVarB.o(false);
        }
    }

    @Override // defpackage.fve
    public final void l(MediaRouter.RouteInfo routeInfo, int i) {
        fvj fvjVarX = x(routeInfo);
        if (fvjVarX != null) {
            fvjVarX.a.l(i);
        }
    }

    @Override // defpackage.fve
    public final void m(MediaRouter.RouteInfo routeInfo, int i) {
        fvj fvjVarX = x(routeInfo);
        if (fvjVarX != null) {
            fvjVarX.a.m(i);
        }
    }

    protected void n(ivx ivxVar, fuf fufVar) {
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) ivxVar.a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            fufVar.b(q);
        }
        if ((supportedTypes & 2) != 0) {
            fufVar.b(r);
        }
        fufVar.i(routeInfo.getPlaybackType());
        int playbackStream = routeInfo.getPlaybackStream();
        Bundle bundle = fufVar.a;
        bundle.putInt("playbackStream", playbackStream);
        fufVar.k(routeInfo.getVolume());
        fufVar.m(routeInfo.getVolumeMax());
        fufVar.l(routeInfo.getVolumeHandling());
        bundle.putBoolean("isSystemRoute", (supportedTypes & 8388608) == 0);
        if (!routeInfo.isEnabled()) {
            fufVar.g(false);
        }
        if (routeInfo.isConnecting()) {
            fufVar.d(1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            fufVar.j(presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            fufVar.e(description.toString());
        }
    }

    protected final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ivx) arrayList.get(i)).a == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    protected final int p(String str) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((String) ((ivx) arrayList.get(i)).b).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    protected final int q(fux fuxVar) {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((fvj) arrayList.get(i)).a == fuxVar) {
                return i;
            }
        }
        return -1;
    }

    protected final String r(MediaRouter.RouteInfo routeInfo) {
        Context context = this.e;
        CharSequence name = routeInfo.getName(context);
        if (!TextUtils.isEmpty(name)) {
            return name.toString();
        }
        if ((routeInfo.getSupportedTypes() & 8388608) != 0) {
            return "";
        }
        int deviceType = routeInfo.getDeviceType();
        return context.getString(deviceType != 1 ? deviceType != 2 ? deviceType != 3 ? R.string.mr_route_name_unknown : R.string.mr_route_name_bluetooth : R.string.mr_route_name_speaker : R.string.mr_route_name_tv);
    }

    @Override // defpackage.fvl
    public final void s(fux fuxVar) {
        if (fuxVar.i() != this) {
            MediaRouter mediaRouter = this.a;
            MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = mediaRouter.createUserRoute(this.d);
            fvj fvjVar = new fvj(fuxVar, userRouteInfoCreateUserRoute);
            userRouteInfoCreateUserRoute.setTag(fvjVar);
            userRouteInfoCreateUserRoute.setVolumeCallback(this.c);
            y(fvjVar);
            this.p.add(fvjVar);
            mediaRouter.addUserRoute(userRouteInfoCreateUserRoute);
            return;
        }
        int iO = o(this.a.getSelectedRoute(8388611));
        if (iO >= 0) {
            if (((String) ((ivx) this.o.get(iO)).b).equals(fuxVar.c)) {
                fuxVar.o(false);
            }
        }
    }

    @Override // defpackage.fvl
    public final void t(fux fuxVar) {
        int iQ;
        if (fuxVar.i() == this || (iQ = q(fuxVar)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((fvj) this.p.remove(iQ)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.a.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
        }
    }

    @Override // defpackage.fvl
    public final void u(fux fuxVar) {
        if (fuxVar.t()) {
            if (fuxVar.i() != this) {
                int iQ = q(fuxVar);
                if (iQ >= 0) {
                    w(((fvj) this.p.get(iQ)).b);
                    return;
                }
                return;
            }
            int iP = p(fuxVar.c);
            if (iP >= 0) {
                w((MediaRouter.RouteInfo) ((ivx) this.o.get(iP)).a);
            }
        }
    }

    protected final void v() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.o;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            fus.j((fug) ((ivx) arrayList2.get(i)).c, arrayList);
        }
        dA(new fuq(arrayList, false));
    }

    protected final void w(MediaRouter.RouteInfo routeInfo) {
        this.a.selectRoute(8388611, routeInfo);
    }

    protected final void z(ivx ivxVar) {
        fuf fufVar = new fuf((String) ivxVar.b, r((MediaRouter.RouteInfo) ivxVar.a));
        n(ivxVar, fufVar);
        ivxVar.c = fufVar.a();
    }

    @Override // defpackage.fvc
    public final void h() {
    }

    @Override // defpackage.fvc
    public final void j() {
    }

    @Override // defpackage.fvc
    public final void k() {
    }
}
