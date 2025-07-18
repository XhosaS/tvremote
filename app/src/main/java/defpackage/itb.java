package defpackage;

import android.content.Context;
import android.media.tv.TvInputInfo;
import android.media.tv.TvInputManager;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itb implements ism {
    private final Context a;
    private final TvInputManager b;
    private final String c;
    private final boolean d;

    public itb(Context context, TvInputManager tvInputManager) {
        List<TvInputInfo> tvInputList;
        context.getClass();
        this.a = context;
        this.b = tvInputManager;
        this.c = "action.devices.traits.Toggles";
        boolean z = false;
        if (tvInputManager != null && (tvInputList = tvInputManager.getTvInputList()) != null) {
            z = !tvInputList.isEmpty();
        }
        this.d = z;
    }

    @Override // defpackage.ism
    public final Object a(agsw agswVar) {
        abaq abaqVar = new abaq();
        TvInputManager tvInputManager = this.b;
        if (tvInputManager != null) {
            ewl ewlVar = ewl.a;
            List<TvInputInfo> tvInputList = tvInputManager.getTvInputList();
            tvInputList.getClass();
            for (Map.Entry entry : ewlVar.d(tvInputList, this.a).entrySet()) {
                String str = (String) entry.getKey();
                ewk ewkVar = (ewk) entry.getValue();
                abau abauVar = new abau();
                abauVar.l("name", ewlVar.b(str));
                abauVar.k("name_values", ewlVar.a(ewkVar));
                abaqVar.a.add(abauVar);
            }
        }
        return agrj.d(new agpi("availableToggles", abaqVar), new agpi("commandOnlyToggles", new abax((Object) true)));
    }

    @Override // defpackage.ism
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ism
    public final boolean c() {
        return this.d;
    }
}
