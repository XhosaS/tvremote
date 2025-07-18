package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class izc implements yjk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ izc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 float, still in use, count: 1, list:
          (r0v3 float) from 0x01a9: INVOKE (r0v4 java.lang.Float) = (r0v3 float) STATIC call: java.lang.Float.valueOf(float):java.lang.Float A[MD:(float):java.lang.Float (c)] (LINE:426)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:468)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v69, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.yjk
    public final java.lang.Object a() {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izc.a():java.lang.Object");
    }
}
