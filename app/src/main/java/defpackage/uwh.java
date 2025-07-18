package defpackage;

import com.facebook.litho.ComponentTree;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uwh {
    public static ComponentTree a(final dru druVar, AtomicReference atomicReference, final drq drqVar, final emk emkVar) {
        return (ComponentTree) DesugarAtomicReference.updateAndGet(atomicReference, new UnaryOperator() { // from class: uwf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ComponentTree componentTree = (ComponentTree) obj;
                if (componentTree != null && !componentTree.A()) {
                    return componentTree;
                }
                emk emkVar2 = emkVar;
                dsi dsiVarC = ComponentTree.c(dru.c(druVar), drqVar, null);
                dsiVarC.d = false;
                dsiVarC.f = emkVar2;
                return dsiVarC.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
