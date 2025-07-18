package defpackage;

import android.content.SharedPreferences;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcz extends omm {
    public final SharedPreferences a;
    private final omi e;

    public lcz(omi omiVar, SharedPreferences sharedPreferences, String str) {
        super(omiVar, str);
        this.a = sharedPreferences;
        this.e = omiVar;
    }

    @Override // defpackage.omm
    protected final void a(olu oluVar) {
        if (oluVar == null) {
            krd.b("Phenotype configurations null.");
            return;
        }
        this.a.edit().putString("phenotype_server_token_key", oluVar.c).apply();
        omi omiVar = this.e;
        oaf oafVar = new oaf();
        oafVar.a = new nku(8);
        omiVar.r(oafVar.a()).k(new nmn(this, 1));
    }

    public final void b(ksn ksnVar, Consumer consumer) {
        oaf oafVar = new oaf();
        String str = this.c;
        String str2 = ksnVar.a;
        omi omiVar = this.e;
        oafVar.a = new nkv(omiVar, str, str2, 5);
        omiVar.r(oafVar.a()).k(new nva(this, ksnVar, consumer, 1));
    }
}
