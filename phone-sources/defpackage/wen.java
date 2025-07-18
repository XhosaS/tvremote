package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wen implements uqs {
    public final ImmutableSet h;
    private final ImmutableList l;
    private final ImmutableMap m;
    private static final rmp i = new rmp("sherlog.feedback.SherlogFeedbackService");
    public static final rmp a = new rmp("sherlog.feedback.SherlogFeedbackService.");
    private static final rmp j = new rmp("sherlog.feedback.SherlogFeedbackService/");
    public static final uqr b = new vgj(16, (int[][][]) null);
    public static final uqr c = new vgj(17, (boolean[][][]) null);
    public static final uqr d = new vgj(18, (float[][][]) null);
    public static final uqr e = new vgj(19, (byte[]) null, (byte[]) null);
    public static final uqr f = new vgj(20, (char[]) null, (byte[]) null);
    public static final wen g = new wen();
    private static final rmp k = new rmp("sherlogfeedback-pa.googleapis.com");

    private wen() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((ImmutableList.Builder) "autopush-sherlogfeedback-pa.mtls.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "autopush-sherlogfeedback-pa.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily0-sherlogfeedback-pa.mtls.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily0-sherlogfeedback-pa.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily1-sherlogfeedback-pa.mtls.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily1-sherlogfeedback-pa.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily2-sherlogfeedback-pa.mtls.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily2-sherlogfeedback-pa.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily3-sherlogfeedback-pa.mtls.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily3-sherlogfeedback-pa.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily4-sherlogfeedback-pa.mtls.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily4-sherlogfeedback-pa.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily5-sherlogfeedback-pa.mtls.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily5-sherlogfeedback-pa.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily6-sherlogfeedback-pa.mtls.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "daily6-sherlogfeedback-pa.sandbox.googleapis.com");
        builder.add((ImmutableList.Builder) "sherlogfeedback-pa.mtls.googleapis.com");
        builder.add((ImmutableList.Builder) "sherlogfeedback-pa.googleapis.com");
        this.l = builder.build();
        this.h = ImmutableSet.builder().build();
        uqr uqrVar = b;
        uqr uqrVar2 = c;
        uqr uqrVar3 = d;
        uqr uqrVar4 = e;
        uqr uqrVar5 = f;
        ImmutableSet.of(uqrVar, uqrVar2, uqrVar3, uqrVar4, uqrVar5);
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        builder2.put("GetDisclosure", uqrVar);
        builder2.put("StartLogging", uqrVar2);
        builder2.put("EndLogging", uqrVar3);
        builder2.put("ReleaseLogs", uqrVar4);
        builder2.put("UploadLogs", uqrVar5);
        this.m = builder2.build();
        ImmutableMap.builder().build();
    }

    @Override // defpackage.uqs
    public final rmp a() {
        return i;
    }

    @Override // defpackage.uqs
    public final rmp b() {
        return k;
    }

    @Override // defpackage.uqs
    public final uqr c(String str) {
        String str2 = j.a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        ImmutableMap immutableMap = this.m;
        if (immutableMap.containsKey(strSubstring)) {
            return (uqr) immutableMap.get(strSubstring);
        }
        return null;
    }

    @Override // defpackage.uqs
    public final List d() {
        return this.l;
    }
}
