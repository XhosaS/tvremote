package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.google.assistant.sdk.libassistant.ActionExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhr extends ActionExecutor {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/DelegatingActionExecutor");
    public final Set b;
    public final Context c;
    public final agow d;
    public final agow e;
    public final jhs f;
    public final boolean g;
    public final agow h;
    public final NotificationManager i;
    public final jhz j;
    public final fex k;
    public final lzb l;
    public final ghp m;
    public final ghr n;
    public boolean o;
    public final Map p;
    public final List q;
    private final jlr r;
    private final agte s;
    private final gph t;
    private final gtu u;
    private final icj v;
    private final wxc w;

    public jhr(jlr jlrVar, Set set, Context context, agte agteVar, agow agowVar, agow agowVar2, jhs jhsVar, gph gphVar, boolean z, gtu gtuVar, agow agowVar3, icj icjVar, NotificationManager notificationManager, jhz jhzVar, fex fexVar, lzb lzbVar, wxc wxcVar, ghp ghpVar, ghr ghrVar) {
        jlrVar.getClass();
        set.getClass();
        context.getClass();
        agteVar.getClass();
        agowVar2.getClass();
        jhsVar.getClass();
        gtuVar.getClass();
        jhzVar.getClass();
        fexVar.getClass();
        lzbVar.getClass();
        wxcVar.getClass();
        ghpVar.getClass();
        ghrVar.getClass();
        this.r = jlrVar;
        this.b = set;
        this.c = context;
        this.s = agteVar;
        this.d = agowVar;
        this.e = agowVar2;
        this.f = jhsVar;
        this.t = gphVar;
        this.g = z;
        this.u = gtuVar;
        this.h = agowVar3;
        this.v = icjVar;
        this.i = notificationManager;
        this.j = jhzVar;
        this.k = fexVar;
        this.l = lzbVar;
        this.w = wxcVar;
        this.m = ghpVar;
        this.n = ghrVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jiq jiqVar = (jiq) it.next();
            List listD = jiqVar.d();
            ArrayList arrayList2 = new ArrayList(agqq.i(listD, 10));
            Iterator it2 = listD.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new agpi(((ActionExecutor.SupportedAction) it2.next()).name, jiqVar));
            }
            agqq.k(arrayList, arrayList2);
        }
        this.p = agrj.f(arrayList);
        Set set2 = this.b;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = set2.iterator();
        while (it3.hasNext()) {
            agqq.k(arrayList3, ((jiq) it3.next()).d());
        }
        this.q = arrayList3;
    }

    @Override // com.google.assistant.sdk.libassistant.ActionExecutor
    public final ActionExecutor.Result ExecuteAction(String str, Map map, ActionExecutor.ResponseParams responseParams) {
        str.getClass();
        map.getClass();
        responseParams.getClass();
        wvl wvlVarA = this.w.a("DelegatingActionExecutor#ExecuteAction");
        try {
            String str2 = responseParams.eventId;
            str2.getClass();
            gez gezVarA = gfb.a(str, map, str2);
            if (((Boolean) this.e.a()).booleanValue() || ((Boolean) this.d.a()).booleanValue()) {
                gfl gflVarB = ((gfn) this.h.a()).a(rpm.n()).b();
                gflVarB.i(responseParams.eventId);
                abxk abxkVar = ahrs.a;
                ahrq ahrqVar = new ahrq();
                String str3 = responseParams.eventId;
                str3.getClass();
                ahta.c(str3, ahrqVar);
                ahrc ahrcVar = ahrc.a;
                ahqy ahqyVar = new ahqy();
                if ((ahqyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahqyVar.y();
                }
                ahrc ahrcVar2 = (ahrc) ahqyVar.b;
                ahrcVar2.b |= 1;
                ahrcVar2.c = str;
                if (gezVarA != null) {
                    ahqj.b(gezVarA.d, ahqyVar);
                }
                ahrc ahrcVarA = ahqj.a(ahqyVar);
                if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ahrqVar.y();
                }
                ahrs ahrsVar = (ahrs) ahrqVar.b;
                ahrsVar.g = ahrcVarA;
                ahrsVar.f = 8;
                gflVarB.g(ahta.a(ahrqVar));
                gflVarB.c();
            }
            ActionExecutor.Result resultA = a(str, map, responseParams, gezVarA);
            aguc.a(wvlVarA, null);
            return resultA;
        } finally {
        }
    }

    @Override // com.google.assistant.sdk.libassistant.ActionExecutor
    public final ActionExecutor.ConversationParams[] GetConversationParams() {
        wvl wvlVarA = this.w.a("DelegatingActionExecutor#GetConversationParams");
        try {
            ActionExecutor.ConversationParams[] conversationParamsArr = (ActionExecutor.ConversationParams[]) ahak.a(this.s, new jhk(this, null));
            aguc.a(wvlVarA, null);
            return conversationParamsArr;
        } finally {
        }
    }

    @Override // com.google.assistant.sdk.libassistant.ActionExecutor
    public final void PrepareExecution(String str, Map map, ActionExecutor.ResponseParams responseParams) throws abxv {
        str.getClass();
        map.getClass();
        responseParams.getClass();
        String str2 = responseParams.eventId;
        str2.getClass();
        gez gezVarA = gfb.a(str, map, str2);
        if (gezVarA != null) {
            agow agowVar = this.e;
            agow agowVar2 = this.d;
            gey geyVar = gez.a;
            if (geyVar.b(gezVarA, agowVar, agowVar2)) {
                geyVar.a(((gfn) this.h.a()).b(gezVarA.d + (-1) != 7 ? rpm.o() : rpm.A()), gezVarA).c();
            }
        }
        if (((Boolean) this.e.a()).booleanValue() || ((Boolean) this.d.a()).booleanValue()) {
            gfl gflVarB = ((gfn) this.h.a()).a(rpm.z()).b();
            gflVarB.i(responseParams.eventId);
            abxk abxkVar = ahrs.a;
            ahrq ahrqVar = new ahrq();
            String str3 = responseParams.eventId;
            str3.getClass();
            ahta.c(str3, ahrqVar);
            ahrc ahrcVar = ahrc.a;
            ahqy ahqyVar = new ahqy();
            if ((ahqyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahqyVar.y();
            }
            ahrc ahrcVar2 = (ahrc) ahqyVar.b;
            ahrcVar2.b = 1 | ahrcVar2.b;
            ahrcVar2.c = str;
            if (gezVarA != null) {
                ahqj.b(gezVarA.d, ahqyVar);
            }
            ahrc ahrcVarA = ahqj.a(ahqyVar);
            if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ahrqVar.y();
            }
            ahrs ahrsVar = (ahrs) ahrqVar.b;
            ahrsVar.g = ahrcVarA;
            ahrsVar.f = 8;
            gflVarB.g(ahta.a(ahrqVar));
            gflVarB.c();
        }
        wvl wvlVarA = this.w.a("DelegatingActionExecutor#PrepareExecution");
        try {
            d(str, map, responseParams, gezVarA);
            aguc.a(wvlVarA, null);
        } finally {
        }
    }

    public final ActionExecutor.Result a(String str, Map map, ActionExecutor.ResponseParams responseParams, gez gezVar) {
        return (ActionExecutor.Result) ahak.a(this.s, new jhm(gezVar, this, str, map, responseParams, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.jhn
            if (r0 == 0) goto L13
            r0 = r6
            jhn r0 = (defpackage.jhn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jhn r0 = new jhn
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.agpl.b(r6)
            goto L45
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            defpackage.agpl.b(r6)
            gph r6 = r5.t
            gph r2 = defpackage.gph.b
            if (r6 == r2) goto L67
            gph r2 = defpackage.gph.c
            if (r6 == r2) goto L67
            r0.c = r4
            java.lang.Object r6 = r5.c(r0)
            if (r6 == r1) goto L66
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4e
            goto L67
        L4e:
            jlr r6 = r5.r
            jlv r6 = r6.Z()
            jlv r0 = defpackage.jlv.INVOCATION_TYPE_HOTWORD
            if (r6 == r0) goto L61
            jlv r0 = defpackage.jlv.INVOCATION_TYPE_INTENT
            if (r6 == r0) goto L61
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L61:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L66:
            return r1
        L67:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhr.b(agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agsw r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.jho
            if (r0 == 0) goto L13
            r0 = r6
            jho r0 = (defpackage.jho) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jho r0 = new jho
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.agpl.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.agpl.b(r6)
            icj r6 = r5.v
            icg r2 = defpackage.icg.t
            java.util.Collection r6 = r6.c(r2)
            gtu r2 = r5.u
            r0.a = r6
            r0.d = r3
            java.lang.Object r0 = r2.j(r0)
            if (r0 == r1) goto L60
            r4 = r0
            r0 = r6
            r6 = r4
        L4b:
            android.accounts.Account r6 = (android.accounts.Account) r6
            if (r6 == 0) goto L52
            java.lang.String r6 = r6.name
            goto L53
        L52:
            r6 = 0
        L53:
            if (r6 != 0) goto L57
            java.lang.String r6 = ""
        L57:
            boolean r6 = r0.contains(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhr.c(agsw):java.lang.Object");
    }

    public final void d(String str, Map map, ActionExecutor.ResponseParams responseParams, gez gezVar) throws Throwable {
        ahak.a(this.s, new jhq(gezVar, this, str, responseParams, map, null));
    }
}
