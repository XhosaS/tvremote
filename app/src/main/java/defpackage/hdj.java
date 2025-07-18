package defpackage;

import android.content.Intent;
import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hdj extends agtu implements agvb {
    int a;
    final /* synthetic */ Intent b;
    final /* synthetic */ hdk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdj(Intent intent, hdk hdkVar, agsw agswVar) {
        super(2, agswVar);
        this.b = intent;
        this.c = hdkVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hdj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            Intent intent = this.b;
            String action = intent.getAction();
            if (action != null) {
                switch (action.hashCode()) {
                    case -2129631969:
                        if (action.equals("ACTION_BROADCAST_ENABLE_CHANGED")) {
                            this.c.a.c(intent.getBooleanExtra("android.app.slice.extra.TOGGLE_STATE", true));
                            break;
                        }
                        break;
                    case -2095186667:
                        if (action.equals("ACTION_PERSONAL_RESULTS_CHANGED")) {
                            hdk hdkVar = this.c;
                            boolean booleanExtra = intent.getBooleanExtra("android.app.slice.extra.TOGGLE_STATE", false);
                            Optional optionalOf = intent.hasExtra("reauthProactiveResults") ? Optional.of(Boolean.valueOf(intent.getBooleanExtra("reauthProactiveResults", false))) : Optional.empty();
                            hdr hdrVar = hdkVar.c;
                            String stringExtra = intent.getStringExtra("display_id");
                            hdrVar.h(booleanExtra, optionalOf, hdrVar.a(stringExtra != null ? stringExtra : ""));
                            break;
                        }
                        break;
                    case -1303143834:
                        if (action.equals("ACTION_SAFE_SEARCH_CHANGED")) {
                            this.c.c.i(intent.getBooleanExtra("android.app.slice.extra.TOGGLE_STATE", false));
                            break;
                        }
                        break;
                    case 44074203:
                        if (action.equals("ACTION_SEARCHABLE_APPS_CHANGED")) {
                            hdk hdkVar2 = this.c;
                            this.a = 1;
                            boolean booleanExtra2 = intent.getBooleanExtra("android.app.slice.extra.TOGGLE_STATE", true);
                            Uri data = intent.getData();
                            String queryParameter = data != null ? data.getQueryParameter("package_name") : null;
                            hdi hdiVar = hdkVar2.b;
                            hdr hdrVar2 = hdkVar2.c;
                            String stringExtra2 = intent.getStringExtra("display_id");
                            if (stringExtra2 == null) {
                                stringExtra2 = "";
                            }
                            Object objE = hdiVar.e(queryParameter != null ? queryParameter : "", booleanExtra2, hdrVar2.a(stringExtra2), this);
                            if (objE != agtgVar) {
                                objE = agpu.a;
                            }
                            if (objE == agtgVar) {
                                return agtgVar;
                            }
                        }
                        break;
                    case 1503288553:
                        if (action.equals("ACTION_FARFIELD_MIC_CHANGED")) {
                            this.c.c.g(intent.getBooleanExtra("android.app.slice.extra.TOGGLE_STATE", false));
                            break;
                        }
                        break;
                    case 1877978859:
                        if (action.equals("ACTION_VOICE_INPUT_ENABLED_CHANGED")) {
                            hdk hdkVar3 = this.c;
                            boolean booleanExtra3 = intent.getBooleanExtra("android.app.slice.extra.TOGGLE_STATE", true);
                            String stringExtra3 = intent.getStringExtra("display_id");
                            String str = stringExtra3 != null ? stringExtra3 : "";
                            hdr hdrVar3 = hdkVar3.c;
                            hdrVar3.j(booleanExtra3, hdrVar3.a(str));
                            if (booleanExtra3) {
                                hdkVar3.d.cancel(4);
                                break;
                            }
                        }
                        break;
                }
            }
            throw new IllegalArgumentException("Action type not supported ".concat(String.valueOf(action)));
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hdj(this.b, this.c, agswVar);
    }
}
