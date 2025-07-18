package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdp {
    private final Map a;
    private final ExtensionRegistryLite b = ExtensionRegistryLite.getGeneratedRegistry();

    public pdp(Map map) {
        this.a = map;
    }

    public final void a(abwz abwzVar, List list, abyq abyqVar, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            num.intValue();
            agow agowVar = (agow) this.a.get(num);
            pdo pdoVar = agowVar == null ? null : (pdo) agowVar.a();
            if (pdoVar != null) {
                abxc abxcVarA = this.b.a((abwz) ((abxd) abwzVar.cM(6, null)), num.intValue());
                if (abxcVarA == null) {
                    ((zfd) ((zfd) ((zfd) pfi.a.c()).p(new IllegalStateException("Extension with tag #" + num + " not found. Ensure " + String.valueOf(abwzVar.getClass()) + "is properly extended."))).q("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "provideErrorHandler", 18, "FloggerResultDaggerModule.java")).t();
                } else {
                    if (abxcVarA.a != ((abxd) abwzVar.cM(6, null))) {
                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                    }
                    Object objK = abwzVar.n.k(abxcVarA.d);
                    zyd zydVarA = pdoVar.a((MessageLite) (objK == null ? abxcVarA.b : abxcVarA.b(objK)));
                    if (pdo.a.equals(zydVarA)) {
                        continue;
                    } else if (abyqVar != null) {
                        try {
                            ((pdn) zxn.o(zydVarA)).a(abyqVar);
                        } catch (ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        list2.add(zydVarA);
                    }
                }
            }
        }
    }
}
