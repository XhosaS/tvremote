package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.google.assistant.sdk.libassistant.ActionExecutor;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jiu implements jiq {
    private static final ActionExecutor.SupportedAction j;
    private static final ActionExecutor.SupportedAction k;
    private static final ActionExecutor.SupportedAction l;
    private static final ActionExecutor.SupportedAction m;
    private static final ActionExecutor.SupportedAction n;
    private static final ActionExecutor.SupportedAction o;
    private static final ActionExecutor.SupportedAction p;
    public final agow b;
    public final agow c;
    public final glq d;
    public final gol e;
    public final lzb f;
    public final ghr g;
    public boolean h;
    private final Context q;
    private final gqm r;
    private final jhs s;
    private final gph t;
    private final String u;
    private final eyx v;
    private static final zdy i = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/handlers/DeviceClientOpHandler");
    public static final Map a = agrj.d(new agpi(xoa.BACK, 4), new agpi(xoa.ENTER, 23), new agpi(xoa.SCROLL_DOWN, 20), new agpi(xoa.SCROLL_LEFT, 21), new agpi(xoa.SCROLL_RIGHT, 22), new agpi(xoa.SCROLL_UP, 19));

    static {
        int iA;
        jhy jhyVar = jhy.a;
        fbo fboVar = fbo.j;
        ActionExecutor.SupportedAction.Arg[] argArr = {new ActionExecutor.SupportedAction.Arg("modify_setting_args", "assistant.api.client_op.ModifySettingArgs")};
        abxk abxkVar = xlb.a;
        xla xlaVar = new xla();
        new abxl(((xlb) xlaVar.b).d, xlb.a);
        ackz ackzVar = ackz.ACCESSIBILITY;
        ackzVar.getClass();
        if ((xlaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xlaVar.y();
        }
        xlb xlbVar = (xlb) xlaVar.b;
        abxj abxjVar = xlbVar.d;
        if (!abxjVar.c()) {
            int size = abxjVar.size();
            xlbVar.d = abxjVar.d(size + size);
        }
        xlbVar.d.h(ackzVar.a());
        if ((xlaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xlaVar.y();
        }
        xlb xlbVar2 = (xlb) xlaVar.b;
        xlbVar2.c = 4 | xlbVar2.c;
        xlbVar2.e = true;
        abxd abxdVarV = xlaVar.v();
        abxdVarV.getClass();
        xlb xlbVar3 = (xlb) abxdVarV;
        try {
            int i2 = xlbVar3.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xlbVar3.getClass()).a(xlbVar3);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xlbVar3.getClass()).a(xlbVar3);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xlbVar3.memoizedSerializedSize = (xlbVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xlbVar3.getClass()).m(xlbVar3, abwa.a(abvwVar));
            abvwVar.K();
            j = jhyVar.b(fboVar, argArr, "assistant.api.client_op.properties.DeviceModifySettingClientOpProperty", bArr);
            k = jhy.a.b(fbo.k, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("device_setting_params", "assistant.api.client_op.PowerControlArgs")}, "", new byte[0]);
            l = jhy.a.b(fbo.l, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("screen_navigation_args", "assistant.api.client_op.ScreenNavigationArgs")}, "", new byte[0]);
            m = jhy.a.b(fbo.n, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("input_selection_args", "assistant.api.client_op.InputSelectionArgs")}, "", new byte[0]);
            n = jhy.a.b(fbo.o, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("toggle_state_args", "assistant.api.client_op.ToggleStateArgs")}, "", new byte[0]);
            o = jhy.a.b(fbo.p, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("device_setting_params", "assistant.api.client_op.UpdateVolumeArgs")}, "", new byte[0]);
            p = jhy.a.b(fbo.i, new ActionExecutor.SupportedAction.Arg[]{new ActionExecutor.SupportedAction.Arg("device_link_token_args", "assistant.api.client_op.DeviceLinkTokenArgs")}, "", new byte[0]);
        } catch (IOException e) {
            throw new RuntimeException(a.x(xlbVar3, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public jiu(Context context, gqm gqmVar, ewc ewcVar, agow agowVar, jhs jhsVar, gph gphVar, eyx eyxVar, agow agowVar2, glq glqVar, gol golVar, lzb lzbVar, ghr ghrVar) {
        context.getClass();
        ewcVar.getClass();
        jhsVar.getClass();
        eyxVar.getClass();
        golVar.getClass();
        lzbVar.getClass();
        ghrVar.getClass();
        this.q = context;
        this.r = gqmVar;
        this.b = agowVar;
        this.s = jhsVar;
        this.t = gphVar;
        this.v = eyxVar;
        this.c = agowVar2;
        this.d = glqVar;
        this.e = golVar;
        this.f = lzbVar;
        this.g = ghrVar;
        abs.c(context, new ewa(), ewf.a(), null, 2);
        ewcVar.b(new ewb() { // from class: jis
            @Override // defpackage.ewb
            public final void a(Intent intent) {
                jiu jiuVar = this.a;
                if (jiuVar.h && agvy.c(intent.getAction(), "android.intent.action.SCREEN_ON")) {
                    lzb lzbVar2 = jiuVar.f;
                    lzbVar2.k();
                    lzbVar2.j(Message.obtain((Handler) null, 47));
                    jiuVar.h = false;
                }
            }
        });
        this.u = "DeviceClientOpHandler";
    }

    @Override // defpackage.jiq
    public final /* synthetic */ Object a(agsw agswVar) {
        return agrd.a;
    }

    @Override // defpackage.jiq
    public final Object b(String str, Map map, ActionExecutor.ResponseParams responseParams, gez gezVar, agsw agswVar) {
        ((zdv) i.b().q("com/google/android/apps/tvsearch/voice/libassistant/handlers/DeviceClientOpHandler", "prepare", 138, "DeviceClientOpHandler.kt")).x("Preparing ClientOp: %s", str);
        if (((Boolean) this.b.a()).booleanValue() && gezVar != null) {
            gez.a.a(((gfn) this.c.a()).a(rpm.H()), gezVar).c();
        }
        if (agvy.c(str, fbo.p.a())) {
            this.s.o();
        }
        return agpu.a;
    }

    @Override // defpackage.jiq
    public final String c() {
        return this.u;
    }

    @Override // defpackage.jiq
    public final List d() {
        return agqq.d(j, k, l, m, n, o, p);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // defpackage.jiq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r19, java.util.Map r20, defpackage.gez r21, defpackage.agsw r22) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 3012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jiu.e(java.lang.String, java.util.Map, gez, agsw):java.lang.Object");
    }
}
