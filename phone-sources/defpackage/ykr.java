package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykr {
    private ykr() {
    }

    public static final String a(ykp ykpVar) {
        String string = ykpVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public static final boolean b(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static boolean c(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final int d(char c) {
        return Character.digit((int) c, 10);
    }

    public static final Iterator e(yjz yjzVar) {
        ymx ymxVar = new ymx();
        ymxVar.a = wcq.R(yjzVar, ymxVar, ymxVar);
        return ymxVar;
    }

    public static ymw f(Iterator it) {
        return g(new cxb(it, 4));
    }

    public static ymw g(ymw ymwVar) {
        return ymwVar instanceof ymq ? ymwVar : new ymq(ymwVar);
    }

    public static ymw h(Object obj, yjv yjvVar) {
        return obj == null ? ymt.a : new ynb(new ovo(obj, 5), yjvVar, 1);
    }

    public static List i(ymw ymwVar) {
        Iterator itA = ymwVar.a();
        if (!itA.hasNext()) {
            return yhb.a;
        }
        Object next = itA.next();
        if (!itA.hasNext()) {
            return yfm.p(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (itA.hasNext()) {
            arrayList.add(itA.next());
        }
        return arrayList;
    }

    public static /* synthetic */ String j(ymw ymwVar, CharSequence charSequence) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Iterator itA = ymwVar.a();
        int i = 0;
        while (itA.hasNext()) {
            Object next = itA.next();
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            a.E(sb, next, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final Object l(yil yilVar, yjz yjzVar, yih yihVar) throws Throwable {
        Object objB;
        yil context = yihVar.getContext();
        yil yilVarA = yos.a(context, yilVar);
        yoz.z(yilVarA);
        if (yilVarA == context) {
            yxl yxlVar = new yxl(yilVarA, yihVar);
            objB = wae.H(yxlVar, yxlVar, yjzVar);
        } else {
            bbx bbxVar = yii.k;
            if (yks.e(yilVarA.get(bbxVar), context.get(bbxVar))) {
                yrg yrgVar = new yrg(yilVarA, yihVar);
                yil yilVar2 = ((ynw) yrgVar).a;
                Object objB2 = yxr.b(yilVar2, null);
                try {
                    Object objH = wae.H(yrgVar, yrgVar, yjzVar);
                    yxr.c(yilVar2, objB2);
                    objB = objH;
                } catch (Throwable th) {
                    yxr.c(yilVar2, objB2);
                    throw th;
                }
            } else {
                yph yphVar = new yph(yilVarA, yihVar);
                wae.K(yjzVar, yphVar, yphVar);
                yns ynsVar = yphVar.b;
                while (true) {
                    int i = ynsVar.b;
                    if (i != 0) {
                        if (i != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objB = yqm.b(yphVar.eQ());
                        if (objB instanceof yon) {
                            throw ((yon) objB).b;
                        }
                    } else if (ynsVar.d(0, 1)) {
                        objB = yio.a;
                        break;
                    }
                }
            }
        }
        if (objB == yio.a) {
            yihVar.getClass();
        }
        return objB;
    }

    public static final yqe m(yow yowVar, yil yilVar, int i, yjz yjzVar) {
        boolean zJ = yoz.j(i);
        yil yilVarB = yos.b(yowVar, yilVar);
        ynw yqoVar = zJ ? new yqo(yilVarB, yjzVar) : new yqw(yilVarB, true);
        yoz.i(i, yjzVar, yqoVar, yqoVar);
        return yqoVar;
    }

    public static final Object n(yil yilVar, yjz yjzVar) throws Throwable {
        ypp yppVarA;
        yil yilVarB;
        long jL;
        Thread threadCurrentThread = Thread.currentThread();
        yii yiiVar = (yii) yilVar.get(yii.k);
        if (yiiVar == null) {
            ThreadLocal threadLocal = yra.a;
            yppVarA = yra.a();
            yilVarB = yos.b(ypy.a, yilVar.plus(yppVarA));
        } else {
            if (yiiVar instanceof ypp) {
            }
            ThreadLocal threadLocal2 = yra.a;
            yppVarA = (ypp) yra.a.get();
            yilVarB = yos.b(ypy.a, yilVar);
        }
        yoa yoaVar = new yoa(yilVarB, threadCurrentThread, yppVarA);
        yoz.i(1, yjzVar, yoaVar, yoaVar);
        ypp yppVar = yoaVar.b;
        if (yppVar != null) {
            yppVar.o(false);
        }
        while (true) {
            if (yppVar != null) {
                try {
                    jL = yppVar.l();
                } catch (Throwable th) {
                    ypp yppVar2 = yoaVar.b;
                    if (yppVar2 != null) {
                        yppVar2.m(false);
                    }
                    throw th;
                }
            } else {
                jL = Long.MAX_VALUE;
            }
            if (yoaVar.w()) {
                break;
            }
            LockSupport.parkNanos(yoaVar, jL);
            if (Thread.interrupted()) {
                yoaVar.M(new InterruptedException());
            }
        }
        ypp yppVar3 = yoaVar.b;
        if (yppVar3 != null) {
            yppVar3.m(false);
        }
        Object objB = yqm.b(yoaVar.eQ());
        yon yonVar = objB instanceof yon ? (yon) objB : null;
        if (yonVar == null) {
            return objB;
        }
        throw yonVar.b;
    }

    public static /* synthetic */ ypc o(yow yowVar, yil yilVar, yjz yjzVar, int i) {
        if ((i & 1) != 0) {
            yilVar = yim.a;
        }
        yil yilVarB = yos.b(yowVar, yilVar);
        ynw yqnVar = yoz.j(1) ? new yqn(yilVarB, yjzVar) : new ynw(yilVarB, true);
        yoz.i(1, yjzVar, yqnVar, yqnVar);
        return yqnVar;
    }

    /* JADX WARN: Failed to check method usage
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.MethodNode.getTopParentClass()" because "m" is null
    	at jadx.core.codegen.ClassGen.lambda$skipMethod$0(ClassGen.java:364)
    	at java.base/java.util.stream.ReferencePipeline$2$1.accept(Unknown Source)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
    	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline.collect(Unknown Source)
    	at jadx.core.codegen.ClassGen.skipMethod(ClassGen.java:365)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:327)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
    	at jadx.core.ProcessClass.process(ProcessClass.java:79)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
     */
    public static /* synthetic */ Object p(yjz yjzVar) {
        return n(yim.a, yjzVar);
    }

    public static /* synthetic */ yqe q(yow yowVar, yil yilVar, int i, yjz yjzVar, int i2) {
        if ((i2 & 1) != 0) {
            yilVar = yim.a;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return m(yowVar, yilVar, i, yjzVar);
    }
}
