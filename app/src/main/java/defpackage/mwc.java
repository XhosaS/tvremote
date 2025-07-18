package defpackage;

import com.google.android.libraries.elements.interfaces.CommandHandler;
import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import com.google.android.libraries.elements.interfaces.CommandRunContext;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import io.grpc.Status;
import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwc extends CommandHandler {
    public static final /* synthetic */ int a = 0;
    private final yyk b;
    private final yyk c;
    private final yyr d;
    private final yyr e;
    private final mva f;
    private final agow g;

    public mwc(Map map, Map map2, Set set, Set set2, mva mvaVar, agow agowVar) {
        yyk yykVarI = yyk.i(yxo.a(((yyr) map).values(), set));
        this.b = yykVarI;
        yyk yykVarI2 = yyk.i(yxo.a(((yyr) map2).values(), set2));
        this.c = yykVarI2;
        final yyn yynVarH = yyr.h(yykVarI.size());
        Iterable$EL.forEach(yykVarI, new Consumer() { // from class: mwa
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                nzy nzyVar = (nzy) obj;
                int i = mwc.a;
                yynVarH.c(Integer.valueOf(((abxc) nzyVar.a()).d.b), nzyVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.d = yynVarH.a(false);
        final yyn yynVarH2 = yyr.h(yykVarI2.size());
        Iterable$EL.forEach(yykVarI2, new Consumer() { // from class: mwb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                oep oepVar = (oep) obj;
                int i = mwc.a;
                yynVarH2.c(Integer.valueOf(oepVar.a().a()), oepVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.e = yynVarH2.a(false);
        Long l = 0L;
        l.getClass();
        this.f = mvaVar;
        this.g = agowVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2 A[PHI: r5
  0x00e2: PHI (r5v2 oep) = (r5v1 oep), (r5v1 oep), (r5v8 oep) binds: [B:30:0x007d, B:31:0x007f, B:42:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.agff a(com.google.protos.youtube.elements.CommandOuterClass$Command r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwc.a(com.google.protos.youtube.elements.CommandOuterClass$Command, java.lang.Object):agff");
    }

    public final adav b() {
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandHandler
    public final void run(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, final CommandRunCompletionCallback commandRunCompletionCallback) {
        nzx nzxVarE;
        if (commandRunContext instanceof mvw) {
            nzxVarE = ((mvw) commandRunContext).a;
        } else if (commandRunContext != null) {
            nzv nzvVarP = nzx.p();
            ((nyu) nzvVarP).c = commandRunContext.senderState();
            nzxVarE = nzvVarP.e();
        } else {
            nzv nzvVarP2 = nzx.p();
            ((nyu) nzvVarP2).c = SenderStateOuterClass$SenderState.getDefaultInstance();
            nzxVarE = nzvVarP2.e();
        }
        agff agffVarA = a(commandOuterClass$Command, nzxVarE);
        if (commandRunCompletionCallback != null) {
            aggv aggvVar = new aggv() { // from class: mvy
                @Override // defpackage.aggv
                public final void a() {
                    int i = mwc.a;
                    commandRunCompletionCallback.completion(Status.OK);
                }
            };
            aggy aggyVar = aghm.c;
            agffVarA = agffVarA.m(aggyVar, aggyVar, aggvVar).d(new aggy() { // from class: mvz
                @Override // defpackage.aggy
                public final void a(Object obj) {
                    int i = mwc.a;
                    commandRunCompletionCallback.completion(Status.b((Throwable) obj));
                }
            });
        }
        agffVarA.k();
    }
}
