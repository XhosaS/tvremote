package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.net.URI;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pmc implements plh {
    public final Executor a;
    public final ugs b;
    public final ply c;
    private final jux d;
    private final ueg e;

    public pmc(jux juxVar, ueg uegVar, Executor executor, ugs ugsVar, ply plyVar) {
        this.d = juxVar;
        this.e = uegVar;
        this.a = executor;
        this.b = ugsVar;
        this.c = plyVar;
    }

    @Override // defpackage.plh
    public final zyd a(final plg plgVar) throws phc {
        URI uri;
        jth jthVar;
        jti jtiVar;
        final zwx zwxVarA;
        yze yylVar;
        plb plbVar = (plb) plgVar;
        Uri uri2 = plbVar.a;
        uri2.getLastPathSegment();
        int i = 0;
        try {
            try {
                jti jtiVar2 = (jti) this.e.c(uri2, new ugr(this.b, zwk.a));
                URI uriCreate = URI.create(plbVar.b);
                jsr jsrVar = new jsr();
                jsrVar.b(0);
                if (jtiVar2 == null) {
                    throw new NullPointerException("Null destination");
                }
                jsrVar.e = jtiVar2;
                if (uriCreate == null) {
                    throw new NullPointerException("Null uri");
                }
                jsrVar.a = uriCreate;
                jth jthVar2 = jth.d;
                jsrVar.a(jthVar2);
                if (ple.c == plbVar.c) {
                    jsrVar.a(jthVar2);
                } else {
                    jtf jtfVarC = jth.c();
                    jtfVarC.b().c(jtg.WIFI);
                    jtfVarC.b().c(jtg.ETHERNET);
                    jtfVarC.b().c(jtg.BLUETOOTH);
                    jtfVarC.c(true);
                    jsrVar.d = jtfVarC.a();
                }
                int i2 = plbVar.d;
                if (i2 > 0) {
                    jsrVar.b(i2);
                }
                yyk yykVar = plbVar.e;
                for (int i3 = 0; i3 < ((zcg) yykVar).d; i3++) {
                    Pair pair = (Pair) yykVar.get(i3);
                    String str = (String) pair.first;
                    String str2 = (String) pair.second;
                    if (jsrVar.b == null) {
                        jsrVar.b = new yzb();
                    }
                    yzb yzbVar = jsrVar.b;
                    ywl.a(str, str2);
                    yxx yxxVarG = (yxx) yzbVar.a().get(str);
                    if (yxxVarG == null) {
                        yxxVarG = yyk.g(4);
                        yzbVar.a().put(str, yxxVarG);
                    }
                    yxxVarG.c(str2);
                }
                yzb yzbVar2 = jsrVar.b;
                if (yzbVar2 != null) {
                    Map map = yzbVar2.a;
                    if (map == null) {
                        yylVar = yxj.a;
                    } else {
                        Set<Map.Entry> setEntrySet = map.entrySet();
                        if (setEntrySet.isEmpty()) {
                            yylVar = yxj.a;
                        } else {
                            yyn yynVar = new yyn(setEntrySet.size());
                            for (Map.Entry entry : setEntrySet) {
                                Object key = entry.getKey();
                                yyk yykVarF = ((yyf) entry.getValue()).f();
                                yynVar.c(key, yykVarF);
                                i += ((zcg) yykVarF).d;
                            }
                            yylVar = new yyl(yynVar.a(true), i);
                        }
                    }
                    jsrVar.c = yylVar;
                } else if (jsrVar.c == null) {
                    jsrVar.c = yxj.a;
                }
                if (jsrVar.g != 1 || (uri = jsrVar.a) == null || (jthVar = jsrVar.d) == null || (jtiVar = jsrVar.e) == null) {
                    StringBuilder sb = new StringBuilder();
                    if (jsrVar.a == null) {
                        sb.append(" uri");
                    }
                    if (jsrVar.d == null) {
                        sb.append(" downloadConstraints");
                    }
                    if (jsrVar.e == null) {
                        sb.append(" destination");
                    }
                    if (jsrVar.g == 0) {
                        sb.append(" trafficStatsTag");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                jss jssVar = new jss(uri, jsrVar.c, jthVar, jtiVar, jsrVar.f);
                final jux juxVar = this.d;
                synchronized (juxVar.f) {
                    zwxVarA = juxVar.a(jssVar, 1);
                    zwxVarA.d(new Runnable() { // from class: juj
                        @Override // java.lang.Runnable
                        public final void run() {
                            juxVar.c();
                        }
                    }, juxVar.a);
                    juxVar.d.add(zwxVarA);
                    zwxVarA.d(new Runnable() { // from class: juk
                        @Override // java.lang.Runnable
                        public final void run() {
                            zwx zwxVar = zwxVarA;
                            jux juxVar2 = juxVar;
                            synchronized (juxVar2.f) {
                                juxVar2.d.remove(zwxVar);
                            }
                        }
                    }, zwk.a);
                }
                juxVar.c();
                int i4 = qce.a;
                qfr qfrVarC = qfr.c(zwxVarA);
                zvi zviVar = new zvi() { // from class: plz
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        phc phcVarA;
                        Exception exc = (Exception) obj;
                        exc.getMessage();
                        int i5 = qce.a;
                        if (exc instanceof phc) {
                            phcVarA = (phc) exc;
                        } else {
                            phb phbVarA = this.a.c.a(exc, 0);
                            pha phaVarA = phc.a();
                            phaVarA.b = "failure in download!";
                            phaVarA.a = phbVarA;
                            phaVarA.c = exc;
                            phcVarA = phaVarA.a();
                        }
                        return zxn.g(phcVarA);
                    }
                };
                Executor executor = this.a;
                return qfrVarC.b(Exception.class, zviVar, executor).g(new zvi() { // from class: pma
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        ((juf) obj).a();
                        int i5 = qce.a;
                        plb plbVar2 = (plb) plgVar;
                        pmc pmcVar = this.a;
                        return zud.h(pmcVar.b.a(plbVar2.a), Exception.class, wyo.c(new zvi() { // from class: pmb
                            @Override // defpackage.zvi
                            public final zyd a(Object obj2) {
                                int i6 = qce.a;
                                return zxy.a;
                            }
                        }), pmcVar.a);
                    }
                }, executor);
            } catch (IOException e) {
                if (!(e instanceof ufu) && !(e.getCause() instanceof IllegalArgumentException)) {
                    qce.g(e, "%s: Unable to create DownloadDestination for file %s", "Offroad2FileDownloader", uri2);
                    pha phaVarA = phc.a();
                    phaVarA.a = phb.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                    phaVarA.c = e;
                    throw phaVarA.a();
                }
                qce.d("%s: The file uri is invalid, uri = %s", "Offroad2FileDownloader", uri2);
                pha phaVarA2 = phc.a();
                phaVarA2.a = phb.MALFORMED_FILE_URI_ERROR;
                phaVarA2.c = e;
                throw phaVarA2.a();
            }
        } catch (phc e2) {
            return zxn.g(e2);
        }
    }
}
