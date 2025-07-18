package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psv extends psl {
    public final gex a;
    public final gei b = new psp();
    public final gei c = new psq();
    public final gei d = new psr();
    public final geh e = new pss();
    public final geh f = new pst();
    public final geh g = new psu();

    public psv(gex gexVar) {
        this.a = gexVar;
    }

    @Override // defpackage.psi
    public final int a(String str) {
        return ((Integer) gez.j(this.a, false, true, new psn(str, 3))).intValue();
    }

    @Override // defpackage.psk
    public final psj b(final long j) {
        return (psj) gez.j(this.a, true, false, new yjv() { // from class: psm
            @Override // defpackage.yjv
            public final Object a(Object obj) {
                psj psjVar;
                ghi ghiVarA = ((gic) obj).a("SELECT * FROM preview_programs WHERE _id= ?");
                try {
                    ghiVarA.g(1, j);
                    int iJ = gez.J(ghiVarA, "channel_id");
                    int iJ2 = gez.J(ghiVarA, "weight");
                    int iJ3 = gez.J(ghiVarA, "_id");
                    int iJ4 = gez.J(ghiVarA, "package_name");
                    int iJ5 = gez.J(ghiVarA, "author");
                    int iJ6 = gez.J(ghiVarA, "availability");
                    int iJ7 = gez.J(ghiVarA, "canonical_genre");
                    int iJ8 = gez.J(ghiVarA, "content_id");
                    int iJ9 = gez.J(ghiVarA, "content_rating");
                    int iJ10 = gez.J(ghiVarA, "duration_millis");
                    int iJ11 = gez.J(ghiVarA, "episode_display_number");
                    int iJ12 = gez.J(ghiVarA, "episode_title");
                    int iJ13 = gez.J(ghiVarA, "genre");
                    int iJ14 = gez.J(ghiVarA, "intent_uri");
                    int iJ15 = gez.J(ghiVarA, "interaction_count");
                    int iJ16 = gez.J(ghiVarA, "interaction_type");
                    int iJ17 = gez.J(ghiVarA, "internal_provider_id");
                    int iJ18 = gez.J(ghiVarA, "item_count");
                    int iJ19 = gez.J(ghiVarA, "last_playback_position_millis");
                    int iJ20 = gez.J(ghiVarA, "live");
                    int iJ21 = gez.J(ghiVarA, "logo_uri");
                    int iJ22 = gez.J(ghiVarA, "logo_content_description");
                    int iJ23 = gez.J(ghiVarA, "offer_price");
                    int iJ24 = gez.J(ghiVarA, "poster_art_aspect_ratio");
                    int iJ25 = gez.J(ghiVarA, "poster_art_uri");
                    int iJ26 = gez.J(ghiVarA, "preview_audio_uri");
                    int iJ27 = gez.J(ghiVarA, "preview_video_uri");
                    int iJ28 = gez.J(ghiVarA, "release_date");
                    int iJ29 = gez.J(ghiVarA, "review_rating");
                    int iJ30 = gez.J(ghiVarA, "review_rating_style");
                    int iJ31 = gez.J(ghiVarA, "season_display_number");
                    int iJ32 = gez.J(ghiVarA, "season_title");
                    int iJ33 = gez.J(ghiVarA, "short_description");
                    int iJ34 = gez.J(ghiVarA, "start_time_utc_millis");
                    int iJ35 = gez.J(ghiVarA, "end_time_utc_millis");
                    int iJ36 = gez.J(ghiVarA, "starting_price");
                    int iJ37 = gez.J(ghiVarA, "poster_thumbnail_aspect_ratio");
                    int iJ38 = gez.J(ghiVarA, "thumbnail_uri");
                    int iJ39 = gez.J(ghiVarA, "title");
                    int iJ40 = gez.J(ghiVarA, "type");
                    int iJ41 = gez.J(ghiVarA, "series_id");
                    int iJ42 = gez.J(ghiVarA, "tv_series_item_type");
                    int iJ43 = gez.J(ghiVarA, "video_height");
                    int iJ44 = gez.J(ghiVarA, "video_width");
                    if (ghiVarA.l()) {
                        psjVar = new psj();
                        psjVar.S = ghiVarA.b(iJ);
                        psjVar.T = (int) ghiVarA.b(iJ2);
                        psjVar.b = ghiVarA.b(iJ3);
                        if (ghiVarA.k(iJ4)) {
                            psjVar.c = null;
                        } else {
                            psjVar.c = ghiVarA.d(iJ4);
                        }
                        if (ghiVarA.k(iJ5)) {
                            psjVar.d = null;
                        } else {
                            psjVar.d = ghiVarA.d(iJ5);
                        }
                        psjVar.e = (int) ghiVarA.b(iJ6);
                        if (ghiVarA.k(iJ7)) {
                            psjVar.f = null;
                        } else {
                            psjVar.f = ghiVarA.d(iJ7);
                        }
                        if (ghiVarA.k(iJ8)) {
                            psjVar.g = null;
                        } else {
                            psjVar.g = ghiVarA.d(iJ8);
                        }
                        if (ghiVarA.k(iJ9)) {
                            psjVar.h = null;
                        } else {
                            psjVar.h = ghiVarA.d(iJ9);
                        }
                        psjVar.i = ghiVarA.b(iJ10);
                        if (ghiVarA.k(iJ11)) {
                            psjVar.j = null;
                        } else {
                            psjVar.j = ghiVarA.d(iJ11);
                        }
                        if (ghiVarA.k(iJ12)) {
                            psjVar.k = null;
                        } else {
                            psjVar.k = ghiVarA.d(iJ12);
                        }
                        if (ghiVarA.k(iJ13)) {
                            psjVar.l = null;
                        } else {
                            psjVar.l = ghiVarA.d(iJ13);
                        }
                        if (ghiVarA.k(iJ14)) {
                            psjVar.m = null;
                        } else {
                            psjVar.m = ghiVarA.d(iJ14);
                        }
                        psjVar.n = ghiVarA.b(iJ15);
                        psjVar.o = (int) ghiVarA.b(iJ16);
                        if (ghiVarA.k(iJ17)) {
                            psjVar.p = null;
                        } else {
                            psjVar.p = ghiVarA.d(iJ17);
                        }
                        psjVar.q = (int) ghiVarA.b(iJ18);
                        psjVar.r = ghiVarA.b(iJ19);
                        psjVar.s = ((int) ghiVarA.b(iJ20)) != 0;
                        if (ghiVarA.k(iJ21)) {
                            psjVar.t = null;
                        } else {
                            psjVar.t = ghiVarA.d(iJ21);
                        }
                        if (ghiVarA.k(iJ22)) {
                            psjVar.u = null;
                        } else {
                            psjVar.u = ghiVarA.d(iJ22);
                        }
                        if (ghiVarA.k(iJ23)) {
                            psjVar.v = null;
                        } else {
                            psjVar.v = ghiVarA.d(iJ23);
                        }
                        psjVar.w = (int) ghiVarA.b(iJ24);
                        if (ghiVarA.k(iJ25)) {
                            psjVar.x = null;
                        } else {
                            psjVar.x = ghiVarA.d(iJ25);
                        }
                        if (ghiVarA.k(iJ26)) {
                            psjVar.y = null;
                        } else {
                            psjVar.y = ghiVarA.d(iJ26);
                        }
                        if (ghiVarA.k(iJ27)) {
                            psjVar.z = null;
                        } else {
                            psjVar.z = ghiVarA.d(iJ27);
                        }
                        if (ghiVarA.k(iJ28)) {
                            psjVar.A = null;
                        } else {
                            psjVar.A = ghiVarA.d(iJ28);
                        }
                        if (ghiVarA.k(iJ29)) {
                            psjVar.B = null;
                        } else {
                            psjVar.B = ghiVarA.d(iJ29);
                        }
                        psjVar.C = (int) ghiVarA.b(iJ30);
                        if (ghiVarA.k(iJ31)) {
                            psjVar.D = null;
                        } else {
                            psjVar.D = ghiVarA.d(iJ31);
                        }
                        if (ghiVarA.k(iJ32)) {
                            psjVar.E = null;
                        } else {
                            psjVar.E = ghiVarA.d(iJ32);
                        }
                        if (ghiVarA.k(iJ33)) {
                            psjVar.F = null;
                        } else {
                            psjVar.F = ghiVarA.d(iJ33);
                        }
                        psjVar.G = ghiVarA.b(iJ34);
                        psjVar.H = ghiVarA.b(iJ35);
                        if (ghiVarA.k(iJ36)) {
                            psjVar.I = null;
                        } else {
                            psjVar.I = ghiVarA.d(iJ36);
                        }
                        psjVar.J = (int) ghiVarA.b(iJ37);
                        if (ghiVarA.k(iJ38)) {
                            psjVar.K = null;
                        } else {
                            psjVar.K = ghiVarA.d(iJ38);
                        }
                        if (ghiVarA.k(iJ39)) {
                            psjVar.L = null;
                        } else {
                            psjVar.L = ghiVarA.d(iJ39);
                        }
                        psjVar.M = (int) ghiVarA.b(iJ40);
                        if (ghiVarA.k(iJ41)) {
                            psjVar.N = null;
                        } else {
                            psjVar.N = ghiVarA.d(iJ41);
                        }
                        psjVar.O = (int) ghiVarA.b(iJ42);
                        psjVar.P = (int) ghiVarA.b(iJ43);
                        psjVar.Q = (int) ghiVarA.b(iJ44);
                    } else {
                        psjVar = null;
                    }
                    return psjVar;
                } finally {
                    ghiVarA.close();
                }
            }
        });
    }

    @Override // defpackage.psl
    public final void c(String str) {
        gez.j(this.a, false, true, new qaz(this, str, 1, null));
    }

    @Override // defpackage.psx
    public final int d(String str) {
        return ((Integer) gez.j(this.a, false, true, new psn(str, 0))).intValue();
    }
}
