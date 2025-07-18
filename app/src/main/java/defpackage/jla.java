package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jla implements jiq {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/handlers/OperatorClientOpHandler");
    public final agow b;
    public final agow c;
    public final Random d;
    public final fco e;
    private final agte f;
    private final fkt g;
    private final ahni h;
    private final String i;
    private final List j;

    public jla(agow agowVar, agte agteVar, agow agowVar2, fkt fktVar, Random random, fco fcoVar) {
        agowVar.getClass();
        agteVar.getClass();
        agowVar2.getClass();
        fcoVar.getClass();
        this.b = agowVar;
        this.f = agteVar;
        this.c = agowVar2;
        this.g = fktVar;
        this.d = random;
        this.e = fcoVar;
        this.h = new ahnm(false);
        this.i = "OperatorClientOpHandler";
        this.j = agrd.a;
    }

    @Override // defpackage.jiq
    public final Object a(agsw agswVar) {
        return ahal.a(this.f, new jky(this, null), agswVar);
    }

    @Override // defpackage.jiq
    public final /* synthetic */ Object b(String str, Map map, ActionExecutor.ResponseParams responseParams, gez gezVar, agsw agswVar) {
        return agpu.a;
    }

    @Override // defpackage.jiq
    public final String c() {
        return this.i;
    }

    @Override // defpackage.jiq
    public final List d() {
        return this.j;
    }

    @Override // defpackage.jiq
    public final Object e(String str, Map map, gez gezVar, agsw agswVar) {
        return new ActionExecutor.Result();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        if (r11.c(r2, r10, r0) != r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:15:0x0030, B:46:0x00c1, B:35:0x0097, B:37:0x009d), top: B:56:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #2 {all -> 0x005c, blocks: (B:22:0x0048, B:40:0x00b0, B:42:0x00b8, B:25:0x0055), top: B:56:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1 A[Catch: all -> 0x0035, PHI: r2 r9 r10
  0x00c1: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:36:0x009b, B:45:0x00be] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r9v10 ahni) = (r9v8 ahni), (r9v12 ahni) binds: [B:36:0x009b, B:45:0x00be] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r10v9 boolean) = (r10v19 boolean), (r10v12 boolean) binds: [B:36:0x009b, B:45:0x00be] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:15:0x0030, B:46:0x00c1, B:35:0x0097, B:37:0x009d), top: B:56:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11, types: [ahni] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [ahni] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.String r9, boolean r10, defpackage.agsw r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jla.f(java.lang.String, boolean, agsw):java.lang.Object");
    }
}
