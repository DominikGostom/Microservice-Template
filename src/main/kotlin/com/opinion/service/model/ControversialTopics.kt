package com.opinion.service.model

enum class ControversialTopics(val topic: String) {
    Surveillance_Privacy("Balancing national security concerns with individual privacy rights."),
    Immigration_Policy("Debates over immigration laws and their impact on the economy and national identity."),
    Affirmative_Action("The use and fairness of affirmative action in education and employment."),
    Capitalism_vs_Socialism("Economic systems and which is more beneficial for society."),
    Universal_Healthcare("Should healthcare be free and provided by the government."),
    Same_Sex_Marriage("Legalization and recognition of same-sex marriages."),
    Gender_Identity("Recognition and rights of transgender and non-binary individuals."),
    Role_of_Religion("The role of religion in public life and government."),
    Censorship_Freedom_of_Speech("The limits of free speech and the role of censorship."),
    Social_Media_Impact("The effects of social media on communication and society."),
    Police_Brutality("Issues of police violence and systemic racism."),
    Foreign_Policy("The approach to international relations and military interventions."),
    Welfare_State("The extent of government support for citizens."),
    Artificial_Intelligence("The rise of AI and its impact on employment and ethics."),
    Gig_Economy("The changing nature of work and workers' rights."),
    Net_Neutrality("The regulation of internet service providers and information flow."),
    Student_Loan_Debt("The growing crisis of student debt."),
    Obesity_Epidemic("Public health concerns and the role of the food industry."),
    Nuclear_Energy("The use of nuclear power and its safety."),
    Cultural_Appropriation("The borrowing of cultural elements and its implications."),
    Gig_Worker_Rights("The rights and protections for gig economy workers."),
    Role_of_NATO_UN("The effectiveness and role of international organizations."),
    Human_Genetic_Modification("Ethics of modifying human DNA for health or enhancement."),
    Space_Colonization("The ethics and feasibility of colonizing other planets."),
    Artificial_Wombs("The implications of ectogenesis on society and reproductive rights."),
    Use_of_Drones("The use of drones in warfare and surveillance."),
    Age_of_Consent_Laws("Debating the appropriate age of consent for sexual activities."),
    Corporate_Lobbying("The influence of corporate money in politics."),
    Sex_Work_Legalization("The debate over the legalization and regulation of sex work."),
    Pharmaceutical_Industry_Ethics("The ethics of drug pricing and access to medication."),
    Minimum_Wage("The impact of raising the minimum wage on the economy and workers."),
    Role_of_Monarchy("The relevance and power of monarchies in the modern world."),
    Free_Trade_vs_Protectionism("The benefits and drawbacks of free trade vs. protective tariffs."),
    Performance_Enhancing_Drugs("The use of steroids and other drugs in sports."),
    Media_Bias("Concerns over bias in the media and its impact on public opinion."),
    Cryptocurrency_Future("The stability and regulation of cryptocurrencies."),
    Population_Control("Ethical concerns over government involvement in population control."),
    Right_to_Bear_Arms("Gun ownership rights and public safety concerns."),
    Technology_Impact_on_Children("The influence of technology on child development and behavior."),
    Church_and_State_Separation("The principle of separating church from state in governance.");

    override fun toString(): String {
        return "$name - $topic"
    }
}