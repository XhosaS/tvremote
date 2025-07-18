package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import com.google.android.tv.remote.service.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
class aaf extends aah implements zx, zz {
    private static final ArrayList q;
    private static final ArrayList r;
    protected final MediaRouter a;
    protected final MediaRouter.Callback b;
    protected final MediaRouter.VolumeCallback c;
    protected final MediaRouter.RouteCategory d;
    protected int e;
    protected boolean m;
    protected boolean n;
    protected final ArrayList o;
    protected final ArrayList p;
    private final aag s;

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

    public aaf(Context context, aag aagVar) {
        super(context);
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.s = aagVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.a = mediaRouter;
        this.b = new zy(this);
        this.c = new aaa(this);
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
        mediaRouter.addCallback(this.e, this.b, i);
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
        aps apsVar = new aps(routeInfo, str2);
        z(apsVar);
        this.o.add(apsVar);
        return true;
    }

    protected static final aae x(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof aae) {
            return (aae) tag;
        }
        return null;
    }

    protected static final void y(aae aaeVar) {
        MediaRouter.UserRouteInfo userRouteInfo = aaeVar.b;
        zu zuVar = aaeVar.a;
        userRouteInfo.setName(zuVar.d);
        userRouteInfo.setPlaybackType(zuVar.h);
        userRouteInfo.setPlaybackStream(zuVar.i);
        userRouteInfo.setVolume(zuVar.k);
        userRouteInfo.setVolumeMax(zuVar.l);
        userRouteInfo.setVolumeHandling(zuVar.b());
        userRouteInfo.setDescription(zuVar.e);
    }

    @Override // defpackage.zx
    public final void a(MediaRouter.RouteInfo routeInfo) {
        if (B(routeInfo)) {
            v();
        }
    }

    @Override // defpackage.zn
    public final zl b(String str) {
        int iP = p(str);
        if (iP >= 0) {
            return new aad((MediaRouter.RouteInfo) ((aps) this.o.get(iP)).b);
        }
        return null;
    }

    @Override // defpackage.zx
    public final void c(MediaRouter.RouteInfo routeInfo) {
        int iO;
        if (x(routeInfo) != null || (iO = o(routeInfo)) < 0) {
            return;
        }
        z((aps) this.o.get(iO));
        v();
    }

    @Override // defpackage.zn
    public final void d(zg zgVar) {
        boolean zB;
        int i = 0;
        if (zgVar != null) {
            List listA = zgVar.a().a();
            int size = listA.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) listA.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                i++;
            }
            zB = zgVar.b();
            i = i2;
        } else {
            zB = false;
        }
        if (this.e == i && this.m == zB) {
            return;
        }
        this.e = i;
        this.m = zB;
        A();
    }

    @Override // defpackage.zx
    public final void e(MediaRouter.RouteInfo routeInfo) {
        int iO = o(routeInfo);
        if (iO >= 0) {
            aps apsVar = (aps) this.o.get(iO);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != ((zf) apsVar.c).e()) {
                ze zeVar = new ze((zf) apsVar.c);
                zeVar.j(displayId);
                apsVar.c = zeVar.a();
                v();
            }
        }
    }

    @Override // defpackage.zx
    public final void f(MediaRouter.RouteInfo routeInfo) {
        int iO;
        if (x(routeInfo) != null || (iO = o(routeInfo)) < 0) {
            return;
        }
        this.o.remove(iO);
        v();
    }

    @Override // defpackage.zx
    public final void g(MediaRouter.RouteInfo routeInfo) {
        int iO;
        if (x(routeInfo) != null || (iO = o(routeInfo)) < 0) {
            return;
        }
        aps apsVar = (aps) this.o.get(iO);
        int volume = routeInfo.getVolume();
        if (volume != ((zf) apsVar.c).f()) {
            ze zeVar = new ze((zf) apsVar.c);
            zeVar.k(volume);
            apsVar.c = zeVar.a();
            v();
        }
    }

    @Override // defpackage.zx
    public final void i(MediaRouter.RouteInfo routeInfo) {
        zu zuVarB;
        if (routeInfo != this.a.getSelectedRoute(8388611)) {
            return;
        }
        aae aaeVarX = x(routeInfo);
        if (aaeVarX != null) {
            aaeVarX.a.i();
            return;
        }
        int iO = o(routeInfo);
        if (iO >= 0) {
            aps apsVar = (aps) this.o.get(iO);
            aag aagVar = this.s;
            Object obj = apsVar.a;
            yv yvVar = (yv) aagVar;
            yvVar.a.removeMessages(262);
            zt ztVarC = yvVar.c(yvVar.l);
            if (ztVarC == null || (zuVarB = ztVarC.b((String) obj)) == null) {
                return;
            }
            zuVarB.i();
        }
    }

    @Override // defpackage.zz
    public final void l(MediaRouter.RouteInfo routeInfo, int i) {
        aae aaeVarX = x(routeInfo);
        if (aaeVarX != null) {
            zv.c();
            zu zuVar = aaeVarX.a;
            yv yvVarA = zv.a();
            int iMin = Math.min(zuVar.l, Math.max(0, i));
            zl zlVarB = yvVarA.b(zuVar);
            if (zlVarB != null) {
                zlVarB.b(iMin);
            }
        }
    }

    @Override // defpackage.zz
    public final void m(MediaRouter.RouteInfo routeInfo, int i) {
        zl zlVarB;
        aae aaeVarX = x(routeInfo);
        if (aaeVarX != null) {
            zv.c();
            if (i == 0 || (zlVarB = zv.a().b(aaeVarX.a)) == null) {
                return;
            }
            zlVarB.c(i);
        }
    }

    protected void n(aps apsVar, ze zeVar) {
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) apsVar.b;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            zeVar.b(q);
        }
        if ((supportedTypes & 2) != 0) {
            zeVar.b(r);
        }
        zeVar.i(routeInfo.getPlaybackType());
        int playbackStream = routeInfo.getPlaybackStream();
        Bundle bundle = zeVar.a;
        bundle.putInt("playbackStream", playbackStream);
        zeVar.k(routeInfo.getVolume());
        zeVar.m(routeInfo.getVolumeMax());
        zeVar.l(routeInfo.getVolumeHandling());
        bundle.putBoolean("isSystemRoute", (supportedTypes & 8388608) == 0);
        if (!routeInfo.isEnabled()) {
            zeVar.g(false);
        }
        if (routeInfo.isConnecting()) {
            zeVar.d(1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            zeVar.j(presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            zeVar.e(description.toString());
        }
    }

    protected final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((aps) arrayList.get(i)).b == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    protected final int p(String str) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((String) ((aps) arrayList.get(i)).a).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    protected final int q(zu zuVar) {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((aae) arrayList.get(i)).a == zuVar) {
                return i;
            }
        }
        return -1;
    }

    protected final String r(MediaRouter.RouteInfo routeInfo) {
        Context context = this.f;
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

    @Override // defpackage.aah
    public final void s(zu zuVar) {
        if (zuVar.d() != this) {
            MediaRouter mediaRouter = this.a;
            MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = mediaRouter.createUserRoute(this.d);
            aae aaeVar = new aae(zuVar, userRouteInfoCreateUserRoute);
            userRouteInfoCreateUserRoute.setTag(aaeVar);
            userRouteInfoCreateUserRoute.setVolumeCallback(this.c);
            y(aaeVar);
            this.p.add(aaeVar);
            mediaRouter.addUserRoute(userRouteInfoCreateUserRoute);
            return;
        }
        int iO = o(this.a.getSelectedRoute(8388611));
        if (iO >= 0) {
            if (((String) ((aps) this.o.get(iO)).a).equals(zuVar.b)) {
                zuVar.i();
            }
        }
    }

    @Override // defpackage.aah
    public final void t(zu zuVar) {
        int iQ;
        if (zuVar.d() == this || (iQ = q(zuVar)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((aae) this.p.remove(iQ)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.a.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
        }
    }

    @Override // defpackage.aah
    public final void u(zu zuVar) {
        zv.c();
        if (zv.a().e() == zuVar) {
            if (zuVar.d() != this) {
                int iQ = q(zuVar);
                if (iQ >= 0) {
                    w(((aae) this.p.get(iQ)).b);
                    return;
                }
                return;
            }
            int iP = p(zuVar.b);
            if (iP >= 0) {
                w((MediaRouter.RouteInfo) ((aps) this.o.get(iP)).b);
            }
        }
    }

    protected final void v() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.o;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            se.h((zf) ((aps) arrayList2.get(i)).c, arrayList);
        }
        F(new zo(arrayList, false));
    }

    protected final void w(MediaRouter.RouteInfo routeInfo) {
        this.a.selectRoute(8388611, routeInfo);
    }

    protected final void z(aps apsVar) {
        ze zeVar = new ze((String) apsVar.a, r((MediaRouter.RouteInfo) apsVar.b));
        n(apsVar, zeVar);
        apsVar.c = zeVar.a();
    }

    @Override // defpackage.zx
    public final void h() {
    }

    @Override // defpackage.zx
    public final void j() {
    }

    @Override // defpackage.zx
    public final void k() {
    }
}
